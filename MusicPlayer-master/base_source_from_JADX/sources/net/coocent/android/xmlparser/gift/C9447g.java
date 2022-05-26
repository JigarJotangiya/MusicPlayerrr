package net.coocent.android.xmlparser.gift;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.coocent.android.xmlparser.C9454k;
import net.coocent.android.xmlparser.C9483n;
import net.coocent.android.xmlparser.C9502v;
import net.coocent.android.xmlparser.widget.view.MarqueeTextView;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;

/* renamed from: net.coocent.android.xmlparser.gift.g */
/* compiled from: GiftRateAdapter */
public class C9447g extends RecyclerView.C0797h<C9448a> {

    /* renamed from: a */
    private final Context f36390a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final List<C9483n> f36391b;

    /* renamed from: c */
    private int f36392c;

    /* renamed from: d */
    private int f36393d;

    /* renamed from: e */
    private boolean f36394e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C9449b f36395f;

    /* renamed from: net.coocent.android.xmlparser.gift.g$a */
    /* compiled from: GiftRateAdapter */
    class C9448a extends RecyclerView.C0792c0 implements View.OnClickListener {

        /* renamed from: g */
        AppCompatImageView f36396g;

        /* renamed from: h */
        MarqueeTextView f36397h;

        /* renamed from: i */
        AppCompatImageButton f36398i;

        C9448a(View view) {
            super(view);
            this.f36396g = (AppCompatImageView) view.findViewById(C8614g.iv_icon);
            this.f36397h = (MarqueeTextView) view.findViewById(C8614g.tv_title);
            this.f36398i = (AppCompatImageButton) view.findViewById(C8614g.btn_install);
            ((ConstraintLayout) view.findViewById(C8614g.layout_gift)).setOnClickListener(this);
            this.f36398i.setOnClickListener(this);
        }

        public void onClick(View view) {
            if ((view.getId() == C8614g.layout_gift || view.getId() == C8614g.btn_install) && C9447g.this.f36395f != null) {
                C9447g.this.f36395f.mo32440a((C9483n) C9447g.this.f36391b.get(getAdapterPosition()));
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.gift.g$b */
    /* compiled from: GiftRateAdapter */
    public interface C9449b {
        /* renamed from: a */
        void mo32440a(C9483n nVar);
    }

    public C9447g(Context context, List<C9483n> list, boolean z) {
        this.f36392c = C8615h.item_gift_rate;
        this.f36393d = 3;
        this.f36394e = false;
        this.f36390a = context;
        if (list == null || list.isEmpty()) {
            this.f36391b = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        this.f36391b = arrayList;
        if (arrayList.size() > 1 && z) {
            arrayList.remove(0);
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m49773e(C9448a aVar, String str, Bitmap bitmap) {
        if (bitmap != null) {
            aVar.f36396g.setImageBitmap(bitmap);
        }
    }

    /* renamed from: f */
    public void onBindViewHolder(C9448a aVar, int i) {
        C9483n nVar = this.f36391b.get(i);
        if (nVar != null) {
            aVar.f36397h.setSelected(true);
            GiftConfig.m49723h(aVar.f36397h, GiftConfig.m49721d(this.f36390a), nVar.mo32696h(), nVar.mo32696h());
            Bitmap h = new C9454k().mo32585h(C9502v.f36501e, nVar, new C9437c(aVar));
            if (h != null) {
                aVar.f36396g.setImageBitmap(h);
            }
        }
    }

    /* renamed from: g */
    public C9448a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C9448a(LayoutInflater.from(this.f36390a).inflate(this.f36392c, viewGroup, false));
    }

    public int getItemCount() {
        if (!this.f36394e) {
            return Math.min(this.f36391b.size(), this.f36393d);
        }
        if (C9502v.m49953x()) {
            return Math.min(this.f36391b.size(), this.f36393d);
        }
        return 0;
    }

    /* renamed from: h */
    public void mo32578h(C9449b bVar) {
        this.f36395f = bVar;
    }

    public C9447g(Context context, List<C9483n> list, int i, int i2, boolean z) {
        this(context, list, i, i2, z, true);
    }

    public C9447g(Context context, List<C9483n> list, int i, int i2, boolean z, boolean z2) {
        this(context, list, z);
        this.f36392c = i;
        this.f36393d = i2;
        this.f36394e = z2;
    }
}
