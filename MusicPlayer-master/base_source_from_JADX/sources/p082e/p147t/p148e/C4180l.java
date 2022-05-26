package p082e.p147t.p148e;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import p082e.p109h.p118o.C3695a;
import p082e.p109h.p118o.C3703i;
import p082e.p147t.p148e.C4168j0;

/* renamed from: e.t.e.l */
/* compiled from: EventBridge */
public class C4180l {

    /* renamed from: e.t.e.l$a */
    /* compiled from: EventBridge */
    private static final class C4181a<K> extends C4168j0.C4174b<K> {

        /* renamed from: a */
        final RecyclerView.C0797h<?> f12524a;

        /* renamed from: b */
        private final C4206t<K> f12525b;

        /* renamed from: c */
        private final C3695a<Runnable> f12526c;

        /* renamed from: e.t.e.l$a$a */
        /* compiled from: EventBridge */
        class C4182a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ int f12527g;

            C4182a(int i) {
                this.f12527g = i;
            }

            public void run() {
                C4181a.this.f12524a.notifyItemChanged(this.f12527g, "Selection-Changed");
            }
        }

        C4181a(C4168j0<K> j0Var, C4206t<K> tVar, RecyclerView.C0797h<?> hVar, C3695a<Runnable> aVar) {
            j0Var.mo14291c(this);
            boolean z = true;
            C3703i.m15824a(tVar != null);
            C3703i.m15824a(hVar != null);
            C3703i.m15824a(aVar == null ? false : z);
            this.f12525b = tVar;
            this.f12524a = hVar;
            this.f12526c = aVar;
        }

        /* renamed from: a */
        public void mo14332a(K k, boolean z) {
            int b = this.f12525b.mo10100b(k);
            if (b < 0) {
                Log.w("EventsRelays", "Item change notification received for unknown item: " + k);
                return;
            }
            this.f12526c.accept(new C4182a(b));
        }
    }

    /* renamed from: a */
    public static <K> void m18420a(RecyclerView.C0797h<?> hVar, C4168j0<K> j0Var, C4206t<K> tVar, C3695a<Runnable> aVar) {
        new C4181a(j0Var, tVar, hVar, aVar);
        hVar.registerAdapterDataObserver(j0Var.mo14297i());
    }
}
