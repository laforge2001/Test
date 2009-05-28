import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ImageButton {
	Display display = new Display();
	Shell shell = new Shell(display);
	Image image = new Image(display, "icon/musicstore_48x48.png");

	public ImageButton() {
		// shell.setLayout(new RowLayout());

		Button button = new Button(shell, SWT.PUSH);
		button.setBounds(10, 10, 200, 200);

		button.setImage(image);
		button.setText("button");

		System.out.println(button.getImage());

		shell.pack();
		shell.open();
		// textUser.forceFocus();

		// Set up the event loop.
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				// If no more entries in event queue
				display.sleep();
			}
		}

		display.dispose();
	}

	private void init() {

	}

	public static void main(String[] args) {
		new ImageButton();
	}
}