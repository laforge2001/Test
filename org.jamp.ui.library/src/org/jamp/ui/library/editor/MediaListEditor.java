package org.jamp.ui.library.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
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
import org.jamp.model.library.IJampLibrary;
import org.jamp.model.library.JampFileBasedLibrary;
import org.jamp.model.player.context.JampContextConstants;
import org.jamp.model.player.context.JampContextManager;
import org.jamp.model.query.JampMediaObjectQuery;
import org.jamp.ui.library.views.LibraryView;
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

	// private static List<MediaObject> _mp3List = new ArrayList<MediaObject>();
	//
	// private static List<MusicObject> _music;

	private Table _table;

	private TableViewer _tableViewer;

	private final IJampLibrary _library = new JampFileBasedLibrary();

	private JampMediaObjectQuery _query;

	public MediaListEditor() {
		this.initData();
	}

	private void initData() {
		String urls = PreferenceConstants.P_PATHS;

		_query = new JampMediaObjectQuery("mp3");
		_library.updateLibrary(urls);
		// _mp3List = _library.get(_query);

	}

	// private List<MusicObject> convertToMusicObject() {
	// List<MusicObject> result = new ArrayList<MusicObject>();
	// for (MediaObject m : _mp3List) {
	// result.add((MusicObject) m);
	// }
	// return result;
	// }

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
		setTitleImage(JFaceResources.getResources().createImageWithDefault(
				input.getImageDescriptor()));
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

		// Set up the context menu for the table - uses the extension point to
		// add
		// to this
		MenuManager menuManager = new MenuManager();
		Menu menu = menuManager.createContextMenu(_tableViewer.getTable());
		// Set the MenuManager
		_tableViewer.getTable().setMenu(menu);
		getSite().registerContextMenu(menuManager, _tableViewer);

		getSite().setSelectionProvider(_tableViewer);
	}

	private void createTableViewer() {
		_tableViewer = new TableViewer(_table);
		_tableViewer.setUseHashlookup(true);
		_tableViewer.setColumnProperties(columnNames);

		// Create a standard content provider
		// ObservableListContentProvider peopleViewerContentProvider = new
		// ObservableListContentProvider();
		// _tableViewer.setContentProvider(peopleViewerContentProvider);
		//
		// // And a standard label provider that maps columns
		// IObservableMap[] attributeMaps = BeansObservables.observeMaps(
		// peopleViewerContentProvider.getKnownElements(),
		// MusicObject.class, columnNames);
		// _tableViewer.setLabelProvider(new ObservableMapLabelProvider(
		// attributeMaps));
		//
		// // Now set the Viewer's input
		// _music = convertToMusicObject();
		// _tableViewer.setInput(new WritableList(_mp3List, MusicObject.class));

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
		// _tableViewer.setContentProvider(new
		// MediaListContentProvider(_playList,
		// _tableViewer));
		_tableViewer.setContentProvider(new MediaListContentProvider(_library,
				_query, _tableViewer));
		_tableViewer.setLabelProvider(new MediaListLabelProvider());
		_tableViewer.setInput(_library);
		_tableViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(SelectionChangedEvent event) {

						if (event.getSelection() instanceof IStructuredSelection) {
							IStructuredSelection playSelection = (IStructuredSelection) event
									.getSelection();
							if (playSelection.getFirstElement() instanceof MediaObject) {
								JampContextManager
										.activateContext(JampContextConstants.PLAY_CONTEXT);
							} else {
								JampContextManager
										.deactivateContext(JampContextConstants.PLAY_CONTEXT);
								;
							}
						}

					}

				});

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

	}

	@Override
	public void dispose() {
		super.dispose();
		getSite().getPage().removeSelectionListener(this);
	}

}
