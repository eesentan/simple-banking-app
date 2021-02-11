import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.EditorKit;
import javax.swing.text.JTextComponent;
import javax.swing.text.Position.Bias;
import javax.swing.text.View;

public class JTextFieldHintUI extends TextUI {

	@Override
	public Rectangle modelToView(JTextComponent t, int pos) throws BadLocationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle modelToView(JTextComponent t, int pos, Bias bias) throws BadLocationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int viewToModel(JTextComponent t, Point pt) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int viewToModel(JTextComponent t, Point pt, Bias[] biasReturn) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNextVisualPositionFrom(JTextComponent t, int pos, Bias b, int direction, Bias[] biasRet)
			throws BadLocationException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void damageRange(JTextComponent t, int p0, int p1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void damageRange(JTextComponent t, int p0, int p1, Bias firstBias, Bias secondBias) {
		// TODO Auto-generated method stub

	}

	@Override
	public EditorKit getEditorKit(JTextComponent t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View getRootView(JTextComponent t) {
		// TODO Auto-generated method stub
		return null;
	}

}
