package it.disim.mde2223.ui.handlers;
import it.disim.mde2223.business.Dummy;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

public class SampleHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		Dummy dummy = new Dummy("people");
		
		StringBuilder sb = new StringBuilder();
		sb.append("hello ");
		sb.append(dummy.getName());
		MessageDialog.openInformation(
				window.getShell(),
				"Ui",
				sb.toString());
		
		return null;
	}
}
