package org.jamp.ui.commandhandler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.handlers.HandlerUtil;

public class ViewCommandHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		return ContributionItemFactory.VIEWS_SHORTLIST.create(HandlerUtil.getActiveWorkbenchWindow(event));
	}

}
