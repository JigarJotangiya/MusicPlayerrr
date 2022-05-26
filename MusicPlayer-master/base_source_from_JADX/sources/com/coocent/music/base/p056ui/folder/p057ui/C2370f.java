package com.coocent.music.base.p056ui.folder.p057ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.List;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p190b.C4448b;
import p159f.p166c.p181e.p182a.p190b.C4449c;
import p159f.p166c.p181e.p182a.p190b.p193j.p195c.C4469b;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.music.base.ui.folder.ui.f */
/* compiled from: DirectoryAdapter.kt */
public final class C2370f extends RecyclerView.C0797h<C2371a> {

    /* renamed from: a */
    private final List<File> f8295a;

    /* renamed from: b */
    private C2372b f8296b;

    /* renamed from: com.coocent.music.base.ui.folder.ui.f$a */
    /* compiled from: DirectoryAdapter.kt */
    public final class C2371a extends RecyclerView.C0792c0 {

        /* renamed from: a */
        private final ImageView f8297a;

        /* renamed from: b */
        private final TextView f8298b;

        /* renamed from: c */
        private final TextView f8299c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2371a(C2370f fVar, View view, C2372b bVar) {
            super(view);
            C8594l.m46771e(fVar, "this$0");
            C8594l.m46771e(view, "itemView");
            C8594l.m46771e(bVar, "clickListener");
            view.setOnClickListener(new C2365a(bVar, this));
            View findViewById = view.findViewById(C4448b.item_file_image);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
            this.f8297a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C4448b.item_file_title);
            Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            this.f8298b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C4448b.item_file_subtitle);
            Objects.requireNonNull(findViewById3, "null cannot be cast to non-null type android.widget.TextView");
            this.f8299c = (TextView) findViewById3;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static final void m11144a(C2372b bVar, C2371a aVar, View view) {
            C8594l.m46771e(bVar, "$clickListener");
            C8594l.m46771e(aVar, "this$0");
            bVar.mo9308a(view, aVar.getAdapterPosition());
        }

        /* renamed from: b */
        public final ImageView mo9316b() {
            return this.f8297a;
        }

        /* renamed from: d */
        public final TextView mo9317d() {
            return this.f8299c;
        }

        /* renamed from: f */
        public final TextView mo9318f() {
            return this.f8298b;
        }
    }

    /* renamed from: com.coocent.music.base.ui.folder.ui.f$b */
    /* compiled from: DirectoryAdapter.kt */
    public interface C2372b {
        /* renamed from: a */
        void mo9308a(View view, int i);
    }

    public C2370f(List<? extends File> list) {
        C8594l.m46771e(list, "mFiles");
        this.f8295a = list;
    }

    /* renamed from: c */
    public final File mo9312c(int i) {
        return this.f8295a.get(i);
    }

    /* renamed from: d */
    public void onBindViewHolder(C2371a aVar, int i) {
        C8594l.m46771e(aVar, "holder");
        File file = this.f8295a.get(i);
        C4469b.C4470a b = C4469b.m19551b(file);
        aVar.mo9316b().setImageResource(b.getIcon());
        aVar.mo9317d().setText(b.getDescription());
        aVar.mo9318f().setText(file.getName());
    }

    /* renamed from: e */
    public C2371a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8594l.m46771e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C4449c.item_lyric, viewGroup, false);
        C8594l.m46770d(inflate, "view");
        C2372b bVar = this.f8296b;
        C8594l.m46769c(bVar);
        return new C2371a(this, inflate, bVar);
    }

    /* renamed from: f */
    public final void mo9315f(C2372b bVar) {
        this.f8296b = bVar;
    }

    public int getItemCount() {
        return this.f8295a.size();
    }
}
