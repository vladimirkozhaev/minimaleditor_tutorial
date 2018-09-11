package minimaleditor.editors;

import org.eclipse.jface.resource.ColorRegistry;
import org.eclipse.jface.resource.FontRegistry;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.themes.ITheme;

public class MpeTextEditor extends TextEditor {


	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		super.createPartControl(parent);
		ITheme currentTheme = getSite().getWorkbenchWindow().getWorkbench().getThemeManager().getTheme("minimaleditor.theme2");

		ColorRegistry colorRegistry = currentTheme.getColorRegistry();
		
		Color color = colorRegistry.get("minimaleditor.colorOverride1");

		FontRegistry fontRegistry = currentTheme.getFontRegistry();
		Font font = fontRegistry.get("minimaleditor.fontOverride1");
		getSourceViewer().getTextWidget().setFont(font);
		getSourceViewer().getTextWidget().setForeground(color);
		
		
	}
}
