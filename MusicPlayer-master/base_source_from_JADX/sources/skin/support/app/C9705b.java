package skin.support.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p443m.p444a.C9317b;
import skin.support.widget.C9716g;

/* renamed from: skin.support.app.b */
/* compiled from: SkinCompatDelegate */
public class C9705b implements LayoutInflater.Factory2 {

    /* renamed from: g */
    private final Context f36741g;

    /* renamed from: h */
    private C9706c f36742h;

    /* renamed from: i */
    private List<WeakReference<C9716g>> f36743i = new CopyOnWriteArrayList();

    private C9705b(Context context) {
        this.f36741g = context;
    }

    /* renamed from: b */
    public static C9705b m50240b(Context context) {
        return new C9705b(context);
    }

    /* renamed from: a */
    public void mo33825a() {
        List<WeakReference<C9716g>> list = this.f36743i;
        if (list != null && !list.isEmpty()) {
            for (WeakReference next : this.f36743i) {
                if (!(next == null || next.get() == null)) {
                    ((C9716g) next.get()).mo33834f();
                }
            }
        }
    }

    /* renamed from: c */
    public View mo33826c(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f36742h == null) {
            this.f36742h = new C9706c();
        }
        for (C9709e a : C9317b.m49321m().mo32279q()) {
            Context a2 = a.mo33833a(this.f36741g, view, attributeSet);
            if (a2 != null) {
                context = a2;
            }
        }
        return this.f36742h.mo33829c(view, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c = mo33826c(view, str, context, attributeSet);
        if (c == null) {
            return null;
        }
        if (c instanceof C9716g) {
            this.f36743i.add(new WeakReference((C9716g) c));
        }
        return c;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View c = mo33826c((View) null, str, context, attributeSet);
        if (c == null) {
            return null;
        }
        if (c instanceof C9716g) {
            this.f36743i.add(new WeakReference((C9716g) c));
        }
        return c;
    }
}
