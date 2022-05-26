package p159f.p166c.p201g.p202j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.musiceffect.view.EffectVerticalSeekbar;
import java.util.Arrays;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;

/* renamed from: f.c.g.j.a */
/* compiled from: EqSeekbarAdapter */
public class C4515a extends RecyclerView.C0797h<C4517b> {

    /* renamed from: a */
    private String[] f13127a;

    /* renamed from: b */
    private int[] f13128b;

    /* renamed from: c */
    private int[] f13129c;

    /* renamed from: d */
    private boolean f13130d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4518c f13131e;

    /* renamed from: f.c.g.j.a$a */
    /* compiled from: EqSeekbarAdapter */
    class C4516a implements EffectVerticalSeekbar.C2471b {

        /* renamed from: a */
        final /* synthetic */ C4517b f13132a;

        /* renamed from: b */
        final /* synthetic */ int f13133b;

        C4516a(C4517b bVar, int i) {
            this.f13132a = bVar;
            this.f13133b = i;
        }

        /* renamed from: a */
        public void mo9593a(EffectVerticalSeekbar effectVerticalSeekbar, int i, boolean z) {
            String str;
            int i2 = (i - 1500) / 100;
            EffectVerticalSeekbar b = this.f13132a.f13135a;
            if (i2 > 0) {
                str = "+" + i2;
            } else {
                str = String.valueOf(i2);
            }
            b.setValue(str);
            if (C4515a.this.f13131e != null) {
                C4515a.this.f13131e.mo9520b(effectVerticalSeekbar, i, z, this.f13133b);
            }
        }

        /* renamed from: b */
        public void mo9594b(EffectVerticalSeekbar effectVerticalSeekbar) {
            if (C4515a.this.f13131e != null) {
                C4515a.this.f13131e.mo9519a(effectVerticalSeekbar, this.f13133b);
            }
        }
    }

    /* renamed from: f.c.g.j.a$b */
    /* compiled from: EqSeekbarAdapter */
    public class C4517b extends RecyclerView.C0792c0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public EffectVerticalSeekbar f13135a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public TextView f13136b;

        public C4517b(C4515a aVar, View view) {
            super(view);
            this.f13135a = (EffectVerticalSeekbar) view.findViewById(C4511f.eqSeekbar);
            this.f13136b = (TextView) view.findViewById(C4511f.tv_barHz);
        }
    }

    /* renamed from: f.c.g.j.a$c */
    /* compiled from: EqSeekbarAdapter */
    public interface C4518c {
        /* renamed from: a */
        void mo9519a(EffectVerticalSeekbar effectVerticalSeekbar, int i);

        /* renamed from: b */
        void mo9520b(EffectVerticalSeekbar effectVerticalSeekbar, int i, boolean z, int i2);
    }

    public C4515a(String[] strArr) {
        this.f13127a = strArr;
        int[] iArr = new int[strArr.length];
        this.f13128b = iArr;
        Arrays.fill(iArr, 0);
        int[] iArr2 = new int[strArr.length];
        this.f13129c = iArr2;
        Arrays.fill(iArr2, 0);
    }

    /* renamed from: d */
    public void onBindViewHolder(C4517b bVar, int i) {
        bVar.f13136b.setText(this.f13127a[i]);
        bVar.f13135a.setEnabled(this.f13130d);
        bVar.f13135a.setOnProgressChangedListener(new C4516a(bVar, i));
        int[] iArr = this.f13129c;
        if (iArr != null && i < iArr.length) {
            bVar.f13135a.setProgress((this.f13129c[i] * 100) + 1500);
        }
        int[] iArr2 = this.f13128b;
        if (iArr2 != null && i < iArr2.length) {
            bVar.f13135a.mo9581d((this.f13128b[i] * 100) + 1500, true);
        }
    }

    /* renamed from: e */
    public C4517b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4517b(this, LayoutInflater.from(viewGroup.getContext()).inflate(C4512g.item_eqseekbar, viewGroup, false));
    }

    /* renamed from: f */
    public void mo15205f(boolean z) {
        this.f13130d = z;
        notifyDataSetChanged();
    }

    /* renamed from: g */
    public void mo15206g(int[] iArr) {
        this.f13128b = iArr;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f13127a.length;
    }

    /* renamed from: h */
    public void mo15207h(int[] iArr) {
        this.f13129c = iArr;
    }

    /* renamed from: i */
    public void mo15208i(C4518c cVar) {
        this.f13131e = cVar;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), this.f13127a.length));
    }
}
