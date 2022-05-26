package p159f.p166c.p224o.p226l;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.Objects;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.l.k */
/* compiled from: KeyboardUtils.kt */
public final class C4661k {

    /* renamed from: a */
    public static final C4661k f13447a = new C4661k();

    private C4661k() {
    }

    /* renamed from: a */
    public final void mo15392a(Context context, View view) {
        IBinder iBinder;
        C8594l.m46771e(context, "context");
        Object systemService = context.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        if (view == null) {
            iBinder = null;
        } else {
            iBinder = view.getWindowToken();
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
    }

    /* renamed from: b */
    public final void mo15393b(Context context, EditText editText) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(editText, "editText");
        Object systemService = context.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(editText, 0);
    }
}
