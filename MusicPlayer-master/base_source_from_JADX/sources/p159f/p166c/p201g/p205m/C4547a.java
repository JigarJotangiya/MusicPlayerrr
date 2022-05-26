package p159f.p166c.p201g.p205m;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p159f.p166c.p171b.p172a.C4315c;
import p159f.p166c.p201g.C4506a;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;
import p159f.p166c.p201g.C4513h;
import p159f.p166c.p201g.p202j.C4519b;

/* renamed from: f.c.g.m.a */
/* compiled from: PresetPopupWindow */
public class C4547a extends PopupWindow {

    /* renamed from: a */
    private RecyclerView f13198a;

    /* renamed from: b */
    private C4519b f13199b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C4549b f13200c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f13201d;

    /* renamed from: f.c.g.m.a$a */
    /* compiled from: PresetPopupWindow */
    class C4548a implements C4519b.C4522c {

        /* renamed from: a */
        final /* synthetic */ boolean f13202a;

        /* renamed from: b */
        final /* synthetic */ List f13203b;

        /* renamed from: c */
        final /* synthetic */ Context f13204c;

        C4548a(boolean z, List list, Context context) {
            this.f13202a = z;
            this.f13203b = list;
            this.f13204c = context;
        }

        /* renamed from: a */
        public void mo15214a(int i) {
            if (this.f13202a) {
                if (i == 0) {
                    if (C4547a.this.f13200c != null) {
                        C4547a.this.f13200c.mo9523a();
                    }
                    C4547a.this.dismiss();
                    return;
                }
                i--;
            }
            if (C4547a.this.f13200c != null) {
                C4547a.this.f13200c.mo9525c(i, (C4315c) this.f13203b.get(i));
            }
            C4547a.this.dismiss();
        }

        /* renamed from: b */
        public void mo15215b(int i) {
            if (this.f13202a) {
                if (i != 0) {
                    i--;
                } else {
                    return;
                }
            }
            if (!C4547a.this.f13201d || !C4506a.m19743q(this.f13204c, ((C4315c) this.f13203b.get(i)).mo14713b())) {
                if (C4547a.this.f13200c != null) {
                    C4547a.this.f13200c.mo9524b(i, (C4315c) this.f13203b.get(i));
                }
                C4547a.this.dismiss();
                return;
            }
            Toast.makeText(this.f13204c, C4513h.equalizer2_preset_no_edited_no_deleted, 0).show();
        }
    }

    /* renamed from: f.c.g.m.a$b */
    /* compiled from: PresetPopupWindow */
    public interface C4549b {
        /* renamed from: a */
        void mo9523a();

        /* renamed from: b */
        void mo9524b(int i, C4315c cVar);

        /* renamed from: c */
        void mo9525c(int i, C4315c cVar);
    }

    public C4547a(Context context, List<C4315c> list, boolean z, int i, int i2) {
        View inflate = LayoutInflater.from(context).inflate(C4512g.preset_layout, (ViewGroup) null);
        setContentView(inflate);
        setWidth(i);
        setHeight(i2);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable());
        this.f13198a = (RecyclerView) inflate.findViewById(C4511f.rv_preset);
        C4519b bVar = new C4519b(context, list, z);
        this.f13199b = bVar;
        this.f13198a.setAdapter(bVar);
        this.f13199b.mo15211f(new C4548a(z, list, context));
    }

    /* renamed from: c */
    public void mo15247c(boolean z) {
        this.f13201d = z;
    }

    /* renamed from: d */
    public void mo15248d(C4549b bVar) {
        this.f13200c = bVar;
    }
}
