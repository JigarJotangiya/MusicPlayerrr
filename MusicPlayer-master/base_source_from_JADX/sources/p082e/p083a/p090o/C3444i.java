package p082e.p083a.p090o;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: e.a.o.i */
/* compiled from: WindowCallbackWrapper */
public class C3444i implements Window.Callback {

    /* renamed from: g */
    final Window.Callback f10968g;

    public C3444i(Window.Callback callback) {
        if (callback != null) {
            this.f10968g = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Window.Callback mo12213a() {
        return this.f10968g;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f10968g.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f10968g.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f10968g.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f10968g.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f10968g.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f10968g.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f10968g.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f10968g.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f10968g.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.f10968g.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f10968g.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f10968g.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f10968g.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f10968g.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f10968g.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f10968g.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        this.f10968g.onPointerCaptureChanged(z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f10968g.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        this.f10968g.onProvideKeyboardShortcuts(list, menu, i);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f10968g.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f10968g.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f10968g.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f10968g.onWindowStartingActionMode(callback);
    }

    public boolean onSearchRequested() {
        return this.f10968g.onSearchRequested();
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f10968g.onWindowStartingActionMode(callback, i);
    }
}
