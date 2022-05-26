package p159f.p166c.p201g.p205m;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p159f.p166c.p171b.p172a.C4315c;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;
import p159f.p166c.p201g.p202j.C4524c;

/* renamed from: f.c.g.m.c */
/* compiled from: ReverbPopupWindow */
public class C4552c extends PopupWindow {

    /* renamed from: a */
    private RecyclerView f13218a;

    /* renamed from: b */
    private C4524c f13219b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4554b f13220c;

    /* renamed from: f.c.g.m.c$a */
    /* compiled from: ReverbPopupWindow */
    class C4553a implements C4524c.C4526b {
        C4553a() {
        }

        /* renamed from: a */
        public void mo15220a(int i) {
            if (C4552c.this.f13220c != null) {
                C4552c.this.f13220c.mo9526a(i);
            }
            C4552c.this.dismiss();
        }
    }

    /* renamed from: f.c.g.m.c$b */
    /* compiled from: ReverbPopupWindow */
    public interface C4554b {
        /* renamed from: a */
        void mo9526a(int i);
    }

    public C4552c(Context context, List<C4315c> list, int i, int i2) {
        View inflate = LayoutInflater.from(context).inflate(C4512g.preset_layout, (ViewGroup) null);
        setContentView(inflate);
        setWidth(i);
        setHeight(i2);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable());
        this.f13218a = (RecyclerView) inflate.findViewById(C4511f.rv_preset);
        C4524c cVar = new C4524c(context, list);
        this.f13219b = cVar;
        this.f13218a.setAdapter(cVar);
        this.f13219b.mo15218f(new C4553a());
    }

    /* renamed from: b */
    public void mo15254b(C4554b bVar) {
        this.f13220c = bVar;
    }
}
