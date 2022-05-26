package p159f.p166c.p201g.p202j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0506a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p159f.p166c.p171b.p172a.C4315c;
import p159f.p166c.p201g.C4506a;
import p159f.p166c.p201g.C4509d;
import p159f.p166c.p201g.C4510e;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;
import p159f.p166c.p201g.C4513h;

/* renamed from: f.c.g.j.b */
/* compiled from: PresetAdapter */
public class C4519b extends RecyclerView.C0797h<C4523d> {

    /* renamed from: a */
    private Context f13137a;

    /* renamed from: b */
    private List<C4315c> f13138b;

    /* renamed from: c */
    private boolean f13139c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4522c f13140d;

    /* renamed from: f.c.g.j.b$a */
    /* compiled from: PresetAdapter */
    class C4520a implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ int f13141g;

        C4520a(int i) {
            this.f13141g = i;
        }

        public void onClick(View view) {
            if (C4519b.this.f13140d != null) {
                C4519b.this.f13140d.mo15214a(this.f13141g);
            }
        }
    }

    /* renamed from: f.c.g.j.b$b */
    /* compiled from: PresetAdapter */
    class C4521b implements View.OnLongClickListener {

        /* renamed from: g */
        final /* synthetic */ int f13143g;

        C4521b(int i) {
            this.f13143g = i;
        }

        public boolean onLongClick(View view) {
            if (C4519b.this.f13140d == null) {
                return true;
            }
            C4519b.this.f13140d.mo15215b(this.f13143g);
            return true;
        }
    }

    /* renamed from: f.c.g.j.b$c */
    /* compiled from: PresetAdapter */
    public interface C4522c {
        /* renamed from: a */
        void mo15214a(int i);

        /* renamed from: b */
        void mo15215b(int i);
    }

    /* renamed from: f.c.g.j.b$d */
    /* compiled from: PresetAdapter */
    public class C4523d extends RecyclerView.C0792c0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ImageView f13145a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public TextView f13146b;

        public C4523d(C4519b bVar, View view) {
            super(view);
            this.f13145a = (ImageView) view.findViewById(C4511f.item_icon);
            this.f13146b = (TextView) view.findViewById(C4511f.item_title);
        }
    }

    public C4519b(Context context, List<C4315c> list, boolean z) {
        this.f13137a = context;
        this.f13138b = list;
        this.f13139c = z;
    }

    /* renamed from: d */
    public void onBindViewHolder(C4523d dVar, int i) {
        int i2;
        int i3;
        if (!this.f13139c) {
            C4315c cVar = this.f13138b.get(i);
            dVar.f13146b.setText(cVar.mo14714c());
            if (cVar.mo14713b() < C4506a.m19734h().length) {
                i2 = C4506a.m19734h()[cVar.mo14713b()];
            } else {
                i2 = C4506a.m19734h()[0];
            }
            dVar.f13145a.setImageResource(i2);
        } else if (i == 0) {
            dVar.f13146b.setText(this.f13137a.getResources().getString(C4513h.effect_save));
            TextView a = dVar.f13146b;
            Context context = this.f13137a;
            int i4 = C4509d.effect_accent;
            a.setTextColor(C0506a.m3150b(context, i4));
            dVar.f13145a.setImageResource(C4510e.icon_save);
            dVar.f13145a.setColorFilter(C0506a.m3150b(this.f13137a, i4));
        } else {
            C4315c cVar2 = this.f13138b.get(i - 1);
            dVar.f13146b.setText(cVar2.mo14714c());
            TextView a2 = dVar.f13146b;
            Context context2 = this.f13137a;
            int i5 = C4509d.white;
            a2.setTextColor(C0506a.m3150b(context2, i5));
            if (cVar2.mo14713b() < C4506a.m19734h().length) {
                i3 = C4506a.m19734h()[cVar2.mo14713b()];
            } else {
                i3 = C4506a.m19734h()[0];
            }
            dVar.f13145a.setImageResource(i3);
            dVar.f13145a.setColorFilter(C0506a.m3150b(this.f13137a, i5));
        }
        dVar.itemView.setOnClickListener(new C4520a(i));
        dVar.itemView.setOnLongClickListener(new C4521b(i));
    }

    /* renamed from: e */
    public C4523d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4523d(this, LayoutInflater.from(viewGroup.getContext()).inflate(C4512g.item_preset, viewGroup, false));
    }

    /* renamed from: f */
    public void mo15211f(C4522c cVar) {
        this.f13140d = cVar;
    }

    public int getItemCount() {
        if (this.f13139c) {
            List<C4315c> list = this.f13138b;
            if (list == null) {
                return 1;
            }
            return 1 + list.size();
        }
        List<C4315c> list2 = this.f13138b;
        if (list2 == null) {
            return 0;
        }
        return list2.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }
}
