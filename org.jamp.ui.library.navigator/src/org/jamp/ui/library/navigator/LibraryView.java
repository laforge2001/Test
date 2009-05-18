package org.jamp.ui.library.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.navigator.CommonNavigator;
import org.jamp.model.NodeObject;
import org.jamp.ui.library.editor.MediaListEditor;
import org.jamp.ui.library.editor.MediaListEditorInput;

public class LibraryView extends CommonNavigator {
	
	private Action _doubleClickAction;

	protected IAdaptable getInitialInput() {
		contributeActions();
		hookDoubleClickAction();
		return new Root();
	}
	
	public void init(IViewSite aSite, IMemento aMemento) {
		
		try {
			super.init(aSite, aMemento);
			
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void contributeActions() {
		_doubleClickAction = new Action() {
			@Override
			public void run() {
				ISelection selection = getCommonViewer().getSelection();
				Object obj = ((IStructuredSelection) selection)
						.getFirstElement();

				if (obj instanceof NodeObject) {
					NodeObject node = (NodeObject) obj;
					MediaListEditorInput input = new MediaListEditorInput(node
							.getName(), node.getImageDescriptor());

					IWorkbenchPage page = PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getActivePage();

					try {
						page.openEditor(input, MediaListEditor.ID);
						getCommonViewer().setSelection(getCommonViewer().getSelection());

					} catch (PartInitException e) {
						System.out.println(e.getMessage());
					}
				}
			}
		};

	}

	private void hookDoubleClickAction() {
		getCommonViewer().addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				_doubleClickAction.run();

			}

		});

	}

}
