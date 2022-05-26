package coocent.musiclibrary.music.folder.p288ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coocent.musiclibrary.music.p285f.p287c.C7351b;
import java.io.File;
import java.util.List;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;

/* renamed from: coocent.musiclibrary.music.folder.ui.a */
/* compiled from: DirectoryAdapter */
public class C7359a extends RecyclerView.C0797h<C7360a> {

    /* renamed from: a */
    private List<File> f32420a;

    /* renamed from: b */
    private C7362b f32421b;

    /* renamed from: coocent.musiclibrary.music.folder.ui.a$a */
    /* compiled from: DirectoryAdapter */
    public class C7360a extends RecyclerView.C0792c0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ImageView f32422a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public TextView f32423b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public TextView f32424c;

        /* renamed from: coocent.musiclibrary.music.folder.ui.a$a$a */
        /* compiled from: DirectoryAdapter */
        class C7361a implements View.OnClickListener {

            /* renamed from: g */
            final /* synthetic */ C7362b f32425g;

            C7361a(C7359a aVar, C7362b bVar) {
                this.f32425g = bVar;
            }

            public void onClick(View view) {
                this.f32425g.mo28111a(view, C7360a.this.getAdapterPosition());
            }
        }

        public C7360a(C7359a aVar, View view, C7362b bVar) {
            super(view);
            view.setOnClickListener(new C7361a(aVar, bVar));
            this.f32422a = (ImageView) view.findViewById(C8350d.item_file_image);
            this.f32423b = (TextView) view.findViewById(C8350d.item_file_title);
            this.f32424c = (TextView) view.findViewById(C8350d.item_file_subtitle);
        }
    }

    /* renamed from: coocent.musiclibrary.music.folder.ui.a$b */
    /* compiled from: DirectoryAdapter */
    public interface C7362b {
        /* renamed from: a */
        void mo28111a(View view, int i);
    }

    public C7359a(Context context, List<File> list) {
        this.f32420a = list;
    }

    /* renamed from: c */
    public File mo28115c(int i) {
        return this.f32420a.get(i);
    }

    /* renamed from: d */
    public void onBindViewHolder(C7360a aVar, int i) {
        File file = this.f32420a.get(i);
        C7351b.C7352a b = C7351b.m41548b(file);
        aVar.f32422a.setImageResource(b.getIcon());
        aVar.f32424c.setText(b.getDescription());
        aVar.f32423b.setText(file.getName());
    }

    /* renamed from: e */
    public C7360a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C7360a(this, LayoutInflater.from(viewGroup.getContext()).inflate(C8351e.item_file, viewGroup, false), this.f32421b);
    }

    /* renamed from: f */
    public void mo28118f(C7362b bVar) {
        this.f32421b = bVar;
    }

    public int getItemCount() {
        return this.f32420a.size();
    }
}
