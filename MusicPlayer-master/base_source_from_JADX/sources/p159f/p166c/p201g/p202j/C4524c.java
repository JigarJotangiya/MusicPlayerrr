package p159f.p166c.p201g.p202j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p159f.p166c.p171b.p172a.C4315c;
import p159f.p166c.p201g.C4506a;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;

/* renamed from: f.c.g.j.c */
/* compiled from: ReverbAdapter */
public class C4524c extends RecyclerView.C0797h<C4527c> {

    /* renamed from: a */
    private List<C4315c> f13147a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4526b f13148b;

    /* renamed from: f.c.g.j.c$a */
    /* compiled from: ReverbAdapter */
    class C4525a implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ int f13149g;

        C4525a(int i) {
            this.f13149g = i;
        }

        public void onClick(View view) {
            if (C4524c.this.f13148b != null) {
                C4524c.this.f13148b.mo15220a(this.f13149g);
            }
        }
    }

    /* renamed from: f.c.g.j.c$b */
    /* compiled from: ReverbAdapter */
    public interface C4526b {
        /* renamed from: a */
        void mo15220a(int i);
    }

    /* renamed from: f.c.g.j.c$c */
    /* compiled from: ReverbAdapter */
    public class C4527c extends RecyclerView.C0792c0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ImageView f13151a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public TextView f13152b;

        public C4527c(C4524c cVar, View view) {
            super(view);
            this.f13151a = (ImageView) view.findViewById(C4511f.item_icon);
            this.f13152b = (TextView) view.findViewById(C4511f.item_title);
        }
    }

    public C4524c(Context context, List<C4315c> list) {
        this.f13147a = list;
    }

    /* renamed from: d */
    public void onBindViewHolder(C4527c cVar, int i) {
        int i2;
        C4315c cVar2 = this.f13147a.get(i);
        cVar.f13152b.setText(cVar2.mo14714c());
        if (cVar2.mo14713b() < C4506a.m19736j().length) {
            i2 = C4506a.m19736j()[cVar2.mo14713b()];
        } else {
            i2 = C4506a.m19736j()[0];
        }
        cVar.f13151a.setImageResource(i2);
        cVar.itemView.setOnClickListener(new C4525a(i));
    }

    /* renamed from: e */
    public C4527c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4527c(this, LayoutInflater.from(viewGroup.getContext()).inflate(C4512g.item_preset, viewGroup, false));
    }

    /* renamed from: f */
    public void mo15218f(C4526b bVar) {
        this.f13148b = bVar;
    }

    public int getItemCount() {
        List<C4315c> list = this.f13147a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }
}
