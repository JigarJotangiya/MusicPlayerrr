package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0133c;
import androidx.appcompat.view.menu.C0186m;
import p082e.p083a.C3406g;

/* renamed from: androidx.appcompat.view.menu.h */
/* compiled from: MenuDialogHelper */
class C0174h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0186m.C0187a {

    /* renamed from: g */
    private C0171g f703g;

    /* renamed from: h */
    private C0133c f704h;

    /* renamed from: i */
    C0168e f705i;

    /* renamed from: j */
    private C0186m.C0187a f706j;

    public C0174h(C0171g gVar) {
        this.f703g = gVar;
    }

    /* renamed from: a */
    public void mo958a() {
        C0133c cVar = this.f704h;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    /* renamed from: b */
    public void mo959b(IBinder iBinder) {
        C0171g gVar = this.f703g;
        C0133c.C0134a aVar = new C0133c.C0134a(gVar.mo954w());
        C0168e eVar = new C0168e(aVar.mo631b(), C3406g.abc_list_menu_item_layout);
        this.f705i = eVar;
        eVar.mo818I(this);
        this.f703g.mo916b(this.f705i);
        aVar.mo632c(this.f705i.mo861a(), this);
        View A = gVar.mo882A();
        if (A != null) {
            aVar.mo634e(A);
        } else {
            aVar.mo635f(gVar.mo956y());
            aVar.mo645p(gVar.mo957z());
        }
        aVar.mo640k(this);
        C0133c a = aVar.mo630a();
        this.f704h = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f704h.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f704h.show();
    }

    /* renamed from: c */
    public void mo590c(C0171g gVar, boolean z) {
        if (z || gVar == this.f703g) {
            mo958a();
        }
        C0186m.C0187a aVar = this.f706j;
        if (aVar != null) {
            aVar.mo590c(gVar, z);
        }
    }

    /* renamed from: d */
    public boolean mo591d(C0171g gVar) {
        C0186m.C0187a aVar = this.f706j;
        if (aVar != null) {
            return aVar.mo591d(gVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f703g.mo894N((C0175i) this.f705i.mo861a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f705i.mo822c(this.f703g, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f704h.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f704h.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f703g.mo925e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f703g.performShortcut(i, keyEvent, 0);
    }
}
