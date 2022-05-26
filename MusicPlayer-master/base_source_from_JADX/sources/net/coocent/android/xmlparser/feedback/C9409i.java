package net.coocent.android.xmlparser.feedback;

import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C1719b;
import com.bumptech.glide.C1738j;
import com.bumptech.glide.p050r.C2178d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.coocent.android.xmlparser.p461z.C9566f;
import p391j.p392a.p393a.C8610c;
import p391j.p392a.p393a.C8613f;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: net.coocent.android.xmlparser.feedback.i */
/* compiled from: FeedbackImageAdapter */
class C9409i extends RecyclerView.C0797h<C9410a> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C9411b f36304a;

    /* renamed from: b */
    private final List<String> f36305b = new ArrayList(Collections.singletonList(BuildConfig.FLAVOR));

    /* renamed from: net.coocent.android.xmlparser.feedback.i$a */
    /* compiled from: FeedbackImageAdapter */
    class C9410a extends RecyclerView.C0792c0 implements View.OnClickListener {

        /* renamed from: g */
        private final AppCompatImageView f36306g;

        /* renamed from: h */
        private final AppCompatImageView f36307h;

        public C9410a(View view) {
            super(view);
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(C8614g.iv_image);
            this.f36306g = appCompatImageView;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(C8614g.iv_delete);
            this.f36307h = appCompatImageView2;
            appCompatImageView.setOnClickListener(this);
            appCompatImageView2.setOnClickListener(this);
        }

        /* renamed from: a */
        public void mo32526a(String str) {
            int l = C9566f.m50201l(this.f36306g.getContext(), C8610c.promotionFeedbackSelectImageBgColor);
            if (TextUtils.isEmpty(str)) {
                this.f36307h.setVisibility(4);
                this.f36306g.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                this.f36306g.setBackgroundColor(l);
                this.f36306g.setImageResource(C8613f.ic_add_pic);
                return;
            }
            this.f36307h.setVisibility(0);
            this.f36306g.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f36306g.setBackgroundColor(0);
            ((C1738j) ((C1738j) C1719b.m8598u(this.f36306g).mo7661r(Uri.parse(str)).mo8385g0(new C2178d(str))).mo8375Z(l)).mo7645z0(this.f36306g);
        }

        public void onClick(View view) {
            if (view.getId() == C8614g.iv_delete) {
                if (C9409i.this.f36304a != null) {
                    C9409i.this.f36304a.mo32509c(getAbsoluteAdapterPosition());
                }
            } else if (view.getId() == C8614g.iv_image && C9409i.this.f36304a != null) {
                String f = C9409i.this.mo32520f(getAbsoluteAdapterPosition());
                if (TextUtils.isEmpty(f)) {
                    C9409i.this.f36304a.mo32508b(getAbsoluteAdapterPosition());
                } else {
                    C9409i.this.f36304a.mo32507a(f, getAbsoluteAdapterPosition());
                }
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.feedback.i$b */
    /* compiled from: FeedbackImageAdapter */
    interface C9411b {
        /* renamed from: a */
        void mo32507a(String str, int i);

        /* renamed from: b */
        void mo32508b(int i);

        /* renamed from: c */
        void mo32509c(int i);
    }

    /* renamed from: e */
    private int m49675e() {
        for (int i = 0; i < this.f36305b.size(); i++) {
            if (TextUtils.isEmpty(this.f36305b.get(i))) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo32519d(String str) {
        int e = m49675e();
        if (e >= 0) {
            if (e == 8) {
                this.f36305b.remove(e);
                this.f36305b.add(e, str);
                notifyItemChanged(e);
                return;
            }
            int size = this.f36305b.size() - 1;
            this.f36305b.add(size, str);
            notifyItemRangeChanged(size, this.f36305b.size() - 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo32520f(int i) {
        return this.f36305b.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<String> mo32521g() {
        return this.f36305b;
    }

    public int getItemCount() {
        return Math.min(this.f36305b.size(), 9);
    }

    /* renamed from: h */
    public void onBindViewHolder(C9410a aVar, int i) {
        aVar.mo32526a(mo32520f(i));
    }

    /* renamed from: i */
    public C9410a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C9410a(LayoutInflater.from(viewGroup.getContext()).inflate(C8615h.promotion_item_feedback_image, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo32524j(int i) {
        if (i >= 0 && i < 9) {
            int e = m49675e();
            this.f36305b.remove(i);
            notifyItemRemoved(i);
            if (e < 0) {
                this.f36305b.add(BuildConfig.FLAVOR);
                notifyItemChanged(this.f36305b.size() - 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo32525k(C9411b bVar) {
        this.f36304a = bVar;
    }
}
