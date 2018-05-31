package pl.mpsk2.aspplugin.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import pl.mpsk2.aspplugin.ASPLanguage;

public class ASPElementType extends IElementType {
    public ASPElementType(@NotNull @NonNls String debugName) {
        super(debugName, ASPLanguage.INSTANCE);
    }
}
