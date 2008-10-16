package org.jamp.ui.library.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IPreferencesService;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.jamp.model.MediaObject;
import org.jamp.model.Playlist;
import org.jamp.model.library.IJampLibrary;
import org.jamp.model.library.JampFileBasedLibrary;
import org.jamp.ui.library.views.LibraryView;
import org.jamp.ui.preferences.Activator;
import org.jamp.ui.preferences.PreferenceConstants;

public class MediaListEditor extends EditorPart implements ISelectionListener {

	public final static String ID = "org.jamp.ui.library.editor.MediaList";

	// Set the table column property names
	private final String TITLE_COLUMN = "title";
	private final String ARTIST_COLUMN = "artist";
	private final String ALBUM_COLUMN = "album";
	private final String YEAR_COLUMN = "year";
	private final String LOCATION_COLUMN = "location";

	// Set column names
	private final String[] columnNames = new String[] { TITLE_COLUMN,
			ARTIST_COLUMN, ALBUM_COLUMN, YEAR_COLUMN, LOCATION_COLUMN };

	private Table _table;

	private TableViewer _tableViewer;

	private final List<MediaObject> testList = new ArrayList<MediaObject>();

	private Playlist _playList;

	private final IJampLibrary _library = new JampFileBasedLibrary();

	private final IPreferencesService _service = Platform
			.getPreferencesService();

	public MediaListEditor() {
		this.initData();
		// TODO Auto-generated constructor stub
	}

	private void initData() {
		String testme = Activator.getDefault().getPluginPreferences()
				.getString(PreferenceConstants.P_PATHS);

		System.out.println(testme);
		_library.updateLibrary();
		// MusicObject testMe = new MusicObject("Viva",
		// "c:/Users/geordi/Desktop/coldplay.mp3", new Mp3API());
		// MusicObject testMe = new MusicObject(
		// "C:/Users/geordi/Music/30 Seconds To Mars/A Beautiful Lie/01 Attack.mp3"
		// ,
		// new Mp3API());
		// MusicObject testMe = new MusicObject(
		// "/home/georde/jamp/org.jamp.music.mp3/testfile/test.mp3",
		// new Mp3API());
		// MusicObject testMe = new MusicObject(
		// "C:/Documents and Settings/georde/jamp/org.jamp.music.mp3/testfile/test.mp3"
		// ,
		// new Mp3API());

		// testList.add(testMe);
		// _playList = new Playlist("Test", testList);
		// TODO Auto-generated method stub

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		setPartName(input.getName());
	}

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout gridLayout = new GridLayout();
		parent.setLayout(gridLayout);

		createTable(parent);

		createTableViewer();

		getSite().getPage().addSelectionListener(LibraryView.ID, this);
		getSite().setSelectionProvider(_tableViewer);

	}

	private void createTableViewer() {
		_tableViewer = new TableViewer(_table);
		_tableViewer.setUseHashlookup(true);
		_tableViewer.setColumnProperties(columnNames);

		// Create the cell editors
		CellEditor[] editors = new CellEditor[columnNames.length];

		// Column 1 : Description (Free text)
		TextCellEditor titleCellEditor = new TextCellEditor(_table);
		((Text) titleCellEditor.getControl()).setTextLimit(60);
		editors[0] = titleCellEditor;

		// Column 1 : Description (Free text)
		TextCellEditor artistCellEditor = new TextCellEditor(_table);
		((Text) artistCellEditor.getControl()).setTextLimit(60);
		editors[1] = artistCellEditor;

		// Column 1 : Description (Free text)
		TextCellEditor albumCellEditor = new TextCellEditor(_table);
		((Text) albumCellEditor.getControl()).setTextLimit(60);
		editors[2] = albumCellEditor;

		// Column 1 : Description (Free text)
		TextCellEditor yearCellEditor = new TextCellEditor(_table);
		((Text) yearCellEditor.getControl()).setTextLimit(60);
		editors[3] = yearCellEditor;

		// Column 1 : Description (Free text)
		TextCellEditor locationCellEditor = new TextCellEditor(_table);
		((Text) locationCellEditor.getControl()).setTextLimit(160);
		editors[4] = locationCellEditor;

		// Assign the cell editors to the viewer
		_tableViewer.setCellEditors(editors);

		// Set the cell modifier for the viewer
		_tableViewer.setCellModifier(new MediaListCellModifier());
		_tableViewer.setContentProvider(new MediaListContentProvider(_playList,
				_tableViewer));
		_tableViewer.setLabelProvider(new MediaListLabelProvider());
		_tableViewer.setInput(_playList);

	}

	private void createTable(Composite parent) {
		// Table.
		_table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);

		_table.setLinesVisible(true);
		_table.setHeaderVisible(true);

		TableColumn tcTitle = new TableColumn(_table, SWT.LEFT);
		tcTitle.setText("Title");

		TableColumn tcArtist = new TableColumn(_table, SWT.LEFT);
		tcArtist.setText("Artist");

		TableColumn tcAlbum = new TableColumn(_table, SWT.LEFT);
		tcAlbum.setText("Album");

		TableColumn tcYear = new TableColumn(_table, SWT.LEFT);
		tcYear.setText("Year");

		TableColumn tcLocation = new TableColumn(_table, SWT.LEFT);
		tcLocation.setText("Location");

		tcTitle.setWidth(80);
		tcArtist.setWidth(80);
		tcAlbum.setWidth(80);
		tcYear.setWidth(80);
		tcLocation.setWidth(180);

		// TableItem item = new TableItem(_table, SWT.NULL);
		// item.setText(new String[] { "Title", "Artist", "Album", "Year",
		// "Location" });
		/*
		 * item.setBackground(i % 2 == 0 ? shell.getDisplay().getSystemColor(
		 * SWT.COLOR_WHITE) : shell.getDisplay().getSystemColor(
		 * SWT.COLOR_GRAY));
		 */
		_table.setLayoutData(new GridData(GridData.FILL_BOTH));

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			// NodeObject
		}

	}

	@Override
	public void dispose() {
		super.dispose();
		getSite().getPage().removeSelectionListener(this);
	}

}
