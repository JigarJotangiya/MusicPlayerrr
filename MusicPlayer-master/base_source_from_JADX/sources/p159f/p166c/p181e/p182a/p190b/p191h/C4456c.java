package p159f.p166c.p181e.p182a.p190b.p191h;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.List;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p190b.C4448b;
import p159f.p166c.p181e.p182a.p190b.C4449c;
import p369i.C8457t;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.b.h.c */
/* compiled from: AllLyricAdapter.kt */
public final class C4456c extends RecyclerView.C0797h<C4457a> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<String> f13031a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8570l<? super String, C8457t> f13032b;

    /* renamed from: f.c.e.a.b.h.c$a */
    /* compiled from: AllLyricAdapter.kt */
    public final class C4457a extends RecyclerView.C0792c0 {

        /* renamed from: a */
        private final TextView f13033a;

        /* renamed from: b */
        private final TextView f13034b;

        /* renamed from: c */
        final /* synthetic */ C4456c f13035c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4457a(C4456c cVar, View view) {
            super(view);
            C8594l.m46771e(cVar, "this$0");
            C8594l.m46771e(view, "rootView");
            this.f13035c = cVar;
            View findViewById = view.findViewById(C4448b.item_file_title);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f13033a = (TextView) findViewById;
            View findViewById2 = view.findViewById(C4448b.item_file_subtitle);
            Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f13034b = (TextView) findViewById2;
            view.setOnClickListener(new C4454a(cVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static final void m19512a(C4456c cVar, C4457a aVar, View view) {
            C8570l c;
            C8594l.m46771e(cVar, "this$0");
            C8594l.m46771e(aVar, "this$1");
            List d = cVar.f13031a;
            if (d != null && (c = cVar.f13032b) != null) {
                c.invoke(d.get(aVar.getAdapterPosition()));
            }
        }

        /* renamed from: b */
        public final TextView mo15145b() {
            return this.f13034b;
        }

        /* renamed from: d */
        public final TextView mo15146d() {
            return this.f13033a;
        }
    }

    public C4456c(List<String> list) {
        this.f13031a = list;
    }

    /* renamed from: e */
    public void onBindViewHolder(C4457a aVar, int i) {
        String str;
        String str2;
        C8594l.m46771e(aVar, "holder");
        List<String> list = this.f13031a;
        if (list != null) {
            File file = new File(list.get(i));
            try {
                String absolutePath = file.getAbsolutePath();
                C8594l.m46770d(absolutePath, "file.absolutePath");
                String absolutePath2 = file.getAbsolutePath();
                C8594l.m46770d(absolutePath2, "file.absolutePath");
                str = absolutePath.substring(C8437p.m46534I(absolutePath2, '/', 0, false, 6, (Object) null) + 1);
                C8594l.m46770d(str, "(this as java.lang.String).substring(startIndex)");
            } catch (Exception unused) {
                str = list.get(i);
            }
            try {
                String absolutePath3 = file.getAbsolutePath();
                C8594l.m46770d(absolutePath3, "file.absolutePath");
                String absolutePath4 = file.getAbsolutePath();
                C8594l.m46770d(absolutePath4, "file.absolutePath");
                str2 = absolutePath3.substring(0, C8437p.m46534I(absolutePath4, '/', 0, false, 6, (Object) null) + 1);
                C8594l.m46770d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } catch (Exception unused2) {
                str2 = BuildConfig.FLAVOR;
            }
            aVar.mo15146d().setText(str);
            aVar.mo15145b().setText(str2);
        }
    }

    /* renamed from: f */
    public C4457a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8594l.m46771e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4449c.item_lyric, viewGroup, false);
        C8594l.m46770d(inflate, "from(parent.context)\n                .inflate(R.layout.item_lyric, parent, false)");
        return new C4457a(this, inflate);
    }

    /* renamed from: g */
    public final void mo15143g(List<String> list) {
        C8594l.m46771e(list, "data");
        List<String> list2 = this.f13031a;
        if (list2 != null) {
            list2.clear();
            this.f13031a.addAll(list);
            notifyDataSetChanged();
        }
    }

    public int getItemCount() {
        List<String> list = this.f13031a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public final void mo15144h(C8570l<? super String, C8457t> lVar) {
        C8594l.m46771e(lVar, "itemClick");
        this.f13032b = lVar;
    }
}
