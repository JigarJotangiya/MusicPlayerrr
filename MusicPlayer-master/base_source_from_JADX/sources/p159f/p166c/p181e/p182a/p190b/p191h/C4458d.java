package p159f.p166c.p181e.p182a.p190b.p191h;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.music.base.data.entity.C2341a;
import com.makeramen.roundedimageview.RoundedImageView;
import java.util.List;
import p159f.p166c.p181e.p182a.p190b.C4448b;
import p159f.p166c.p181e.p182a.p190b.C4449c;
import p159f.p166c.p181e.p182a.p190b.C4450d;
import p159f.p166c.p181e.p182a.p190b.p197l.C4476b;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.h.d */
/* compiled from: ArtWorkAdapter.kt */
public final class C4458d extends RecyclerView.C0797h<C4460b> {

    /* renamed from: a */
    private final Context f13036a;

    /* renamed from: b */
    private final List<C2341a> f13037b;

    /* renamed from: c */
    private C4459a f13038c;

    /* renamed from: f.c.e.a.b.h.d$a */
    /* compiled from: ArtWorkAdapter.kt */
    public interface C4459a {
        /* renamed from: a */
        void mo9297a(C4458d dVar, List<C2341a> list, int i);
    }

    /* renamed from: f.c.e.a.b.h.d$b */
    /* compiled from: ArtWorkAdapter.kt */
    public static final class C4460b extends RecyclerView.C0792c0 {

        /* renamed from: a */
        private final RoundedImageView f13039a;

        /* renamed from: b */
        private final RelativeLayout f13040b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4460b(View view) {
            super(view);
            C8594l.m46771e(view, "v");
            View findViewById = view.findViewById(C4448b.artwork_image);
            C8594l.m46770d(findViewById, "v.findViewById(R.id.artwork_image)");
            this.f13039a = (RoundedImageView) findViewById;
            View findViewById2 = view.findViewById(C4448b.rl_item);
            C8594l.m46770d(findViewById2, "v.findViewById(R.id.rl_item)");
            this.f13040b = (RelativeLayout) findViewById2;
        }

        /* renamed from: a */
        public final RoundedImageView mo15150a() {
            return this.f13039a;
        }

        /* renamed from: b */
        public final RelativeLayout mo15151b() {
            return this.f13040b;
        }
    }

    public C4458d(Context context, List<C2341a> list) {
        C8594l.m46771e(context, "context");
        this.f13036a = context;
        this.f13037b = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m19517e(C4458d dVar, int i, View view) {
        C8594l.m46771e(dVar, "this$0");
        C4459a aVar = dVar.f13038c;
        if (aVar != null) {
            C8594l.m46769c(aVar);
            aVar.mo9297a(dVar, dVar.f13037b, i);
        }
    }

    /* renamed from: d */
    public void onBindViewHolder(C4460b bVar, int i) {
        C8594l.m46771e(bVar, "holder");
        List<C2341a> list = this.f13037b;
        C8594l.m46769c(list);
        C4476b.f13064a.mo15179a(this.f13036a, list.get(i).mo9260a(), C4450d.homepage_album_cover_default, bVar.mo15150a());
        bVar.mo15151b().setOnClickListener(new C4455b(this, i));
        bVar.setIsRecyclable(false);
    }

    /* renamed from: f */
    public C4460b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8594l.m46771e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4449c.item_network_artwork, viewGroup, false);
        C8594l.m46770d(inflate, "from(parent.context).inflate(R.layout.item_network_artwork, parent, false)");
        return new C4460b(inflate);
    }

    /* renamed from: g */
    public final void mo15149g(C4459a aVar) {
        this.f13038c = aVar;
    }

    public int getItemCount() {
        List<C2341a> list = this.f13037b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
