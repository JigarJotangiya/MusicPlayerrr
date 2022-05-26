package p159f.p166c.p201g.p202j;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p159f.p166c.p201g.C4509d;
import p159f.p166c.p201g.C4510e;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;
import p159f.p166c.p201g.C4513h;

/* renamed from: f.c.g.j.d */
/* compiled from: SoundEffectAdapter */
public class C4528d extends RecyclerView.C0797h<C4532d> {

    /* renamed from: a */
    private int[] f13153a = {C4510e.sound_effect_icon1, C4510e.sound_effect_icon2, C4510e.sound_effect_icon3, C4510e.sound_effect_icon4, C4510e.sound_effect_icon5, C4510e.sound_effect_icon6};

    /* renamed from: b */
    private int[] f13154b = {C4513h.electronic, C4513h.rotate3d, C4513h.tonelow, C4513h.surround_sound, C4513h.sound_magic, C4513h.sound_clear_height};

    /* renamed from: c */
    private Context f13155c;

    /* renamed from: d */
    private int f13156d = -1;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C4530b f13157e;

    /* renamed from: f.c.g.j.d$a */
    /* compiled from: SoundEffectAdapter */
    class C4529a implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ int f13158g;

        C4529a(int i) {
            this.f13158g = i;
        }

        public void onClick(View view) {
            if (C4528d.this.f13157e != null) {
                C4528d.this.f13157e.mo9529a(this.f13158g);
            }
        }
    }

    /* renamed from: f.c.g.j.d$b */
    /* compiled from: SoundEffectAdapter */
    public interface C4530b {
        /* renamed from: a */
        void mo9529a(int i);
    }

    /* renamed from: f.c.g.j.d$c */
    /* compiled from: SoundEffectAdapter */
    public class C4531c extends RecyclerView.C0808o {

        /* renamed from: a */
        private Context f13160a;

        public C4531c(C4528d dVar, Context context) {
            this.f13160a = context;
        }

        /* renamed from: i */
        private int m19796i(Context context, float f) {
            return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
        }

        /* renamed from: d */
        public void mo4874d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
            rect.left = m19796i(this.f13160a, 15.0f);
            rect.right = m19796i(this.f13160a, 15.0f);
            rect.bottom = m19796i(this.f13160a, 10.0f);
        }
    }

    /* renamed from: f.c.g.j.d$d */
    /* compiled from: SoundEffectAdapter */
    public class C4532d extends RecyclerView.C0792c0 {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ImageView f13161a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public TextView f13162b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public TextView f13163c;

        public C4532d(C4528d dVar, View view) {
            super(view);
            this.f13161a = (ImageView) view.findViewById(C4511f.item_icon);
            this.f13162b = (TextView) view.findViewById(C4511f.item_title);
            this.f13163c = (TextView) view.findViewById(C4511f.item_use);
        }
    }

    public C4528d(Context context) {
        this.f13155c = context;
    }

    /* renamed from: d */
    public String mo15221d(int i) {
        if (i >= 0) {
            int[] iArr = this.f13154b;
            if (i < iArr.length) {
                return this.f13155c.getString(iArr[i]);
            }
        }
        return this.f13155c.getString(C4513h.effect_custom);
    }

    /* renamed from: e */
    public int mo15222e() {
        return this.f13156d;
    }

    /* renamed from: f */
    public void onBindViewHolder(C4532d dVar, int i) {
        dVar.f13161a.setImageResource(this.f13153a[i]);
        dVar.f13162b.setText(this.f13154b[i]);
        if (this.f13156d == i) {
            dVar.f13163c.setText(C4513h.effect_in_use);
            dVar.f13163c.setTextColor(this.f13155c.getResources().getColor(C4509d.effect_default));
            dVar.f13163c.setBackgroundResource(C4510e.bg_item_in_use);
        } else {
            dVar.f13163c.setText(C4513h.effect_use);
            dVar.f13163c.setTextColor(this.f13155c.getResources().getColor(C4509d.effect_accent));
            dVar.f13163c.setBackgroundResource(C4510e.bg_item_use);
        }
        dVar.f13163c.setOnClickListener(new C4529a(i));
    }

    /* renamed from: g */
    public C4532d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4532d(this, LayoutInflater.from(viewGroup.getContext()).inflate(C4512g.item_soundeffect, viewGroup, false));
    }

    public int getItemCount() {
        return this.f13154b.length;
    }

    /* renamed from: h */
    public void mo15225h(C4530b bVar) {
        this.f13157e = bVar;
    }

    /* renamed from: i */
    public void mo15226i(int i) {
        int i2 = this.f13156d;
        int i3 = C4511f.item_use;
        notifyItemChanged(i2, Integer.valueOf(i3));
        this.f13156d = i;
        notifyItemChanged(i, Integer.valueOf(i3));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.mo4622h(new C4531c(this, recyclerView.getContext()));
    }
}
