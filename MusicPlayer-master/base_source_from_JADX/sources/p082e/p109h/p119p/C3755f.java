package p082e.p109h.p119p;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.h.p.f */
/* compiled from: KeyEventDispatcher */
public class C3755f {

    /* renamed from: a */
    private static boolean f11812a = false;

    /* renamed from: b */
    private static Method f11813b = null;

    /* renamed from: c */
    private static boolean f11814c = false;

    /* renamed from: d */
    private static Field f11815d;

    /* renamed from: e.h.p.f$a */
    /* compiled from: KeyEventDispatcher */
    public interface C3756a {
        /* renamed from: Z0 */
        boolean mo662Z0(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m16081a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f11812a) {
            try {
                f11813b = actionBar.getClass().getMethod("onMenuKeyEvent", new Class[]{KeyEvent.class});
            } catch (NoSuchMethodException unused) {
            }
            f11812a = true;
        }
        Method method = f11813b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, new Object[]{keyEvent})).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m16082b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m16081a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C3774v.m16204i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m16083c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = m16086f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C3774v.m16204i(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m16084d(View view, KeyEvent keyEvent) {
        return C3774v.m16206j(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m16085e(C3756a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return aVar.mo662Z0(keyEvent);
        }
        if (callback instanceof Activity) {
            return m16082b((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return m16083c((Dialog) callback, keyEvent);
        }
        if ((view == null || !C3774v.m16204i(view, keyEvent)) && !aVar.mo662Z0(keyEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m16086f(Dialog dialog) {
        if (!f11814c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f11815d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11814c = true;
        }
        Field field = f11815d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
