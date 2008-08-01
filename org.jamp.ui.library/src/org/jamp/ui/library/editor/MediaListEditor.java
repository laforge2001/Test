package org.jamp.ui.library.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.jamp.ui.library.views.LibraryView;

public class MediaListEditor extends EditorPart implements ISelectionListener {

	public final static String ID = "org.jamp.ui.library.editor.MediaList";

	private Table _table;

	private TableViewer _tableViewer;

	public MediaListEditor() {
		// TODO Auto-generated constructor stub
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

	}

	private void createTableViewer() {
		// TODO Auto-generated method stub

	}

	private void createTable(Composite parent) {
		// Table.
		_table = new Table(parent, SWT.BORDER | SWT.FULL_SELECTION);

		// table.setLinesVisible(true);
		_table.setHeaderVisible(true);

		TableColumn tcFileName = new TableColumn(_table, SWT.LEFT);
		tcFileName.setText("Title");

		TableColumn tcFileSize = new TableColumn(_table, SWT.RIGHT);
		tcFileSize.setText("Artist");

		TableColumn tcDateModified = new TableColumn(_table, SWT.RIGHT);
		tcDateModified.setText("Year");

		tcFileName.setWidth(200);
		tcFileSize.setWidth(80);
		tcDateModified.setWidth(180);

		TableItem item = new TableItem(_table, SWT.NULL);
		item.setText(new String[] { "Name", "Size" });
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
