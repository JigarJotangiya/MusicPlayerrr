package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0170f;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0175i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.u */
/* compiled from: MenuPopupWindow */
public class C0313u extends ListPopupWindow implements C0312t {

    /* renamed from: P */
    private static Method f1418P;

    /* renamed from: O */
    private C0312t f1419O;

    /* renamed from: androidx.appcompat.widget.u$a */
    /* compiled from: MenuPopupWindow */
    public static class C0314a extends C0304q {

        /* renamed from: u */
        final int f1420u;

        /* renamed from: v */
        final int f1421v;

        /* renamed from: w */
        private C0312t f1422w;

        /* renamed from: x */
        private MenuItem f1423x;

        public C0314a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1420u = 22;
                this.f1421v = 21;
                return;
            }
            this.f1420u = 21;
            this.f1421v = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0170f fVar;
            int pointToPosition;
            int i2;
            if (this.f1422w != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (C0170f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (C0170f) adapter;
                }
                C0175i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f1423x;
                if (menuItem != iVar) {
                    C0171g b = fVar.mo874b();
                    if (menuItem != null) {
                        this.f1422w.mo858h(b, menuItem);
                    }
                    this.f1423x = iVar;
                    if (iVar != null) {
                        this.f1422w.mo857e(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1420u) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1421v) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0170f) getAdapter()).mo874b().mo925e(false);
                return true;
            }
        }

        public void setHoverListener(C0312t tVar) {
            this.f1422w = tVar;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1418P = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0313u(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: R */
    public void mo2133R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1026K.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: S */
    public void mo2134S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1026K.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: T */
    public void mo2135T(C0312t tVar) {
        this.f1419O = tVar;
    }

    /* renamed from: U */
    public void mo2136U(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1418P;
            if (method != null) {
                try {
                    method.invoke(this.f1026K, new Object[]{Boolean.valueOf(z)});
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1026K.setTouchModal(z);
        }
    }

    /* renamed from: e */
    public void mo857e(C0171g gVar, MenuItem menuItem) {
        C0312t tVar = this.f1419O;
        if (tVar != null) {
            tVar.mo857e(gVar, menuItem);
        }
    }

    /* renamed from: h */
    public void mo858h(C0171g gVar, MenuItem menuItem) {
        C0312t tVar = this.f1419O;
        if (tVar != null) {
            tVar.mo858h(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0304q mo1634s(Context context, boolean z) {
        C0314a aVar = new C0314a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
