package net.coocent.android.xmlparser.gift;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import net.coocent.android.xmlparser.C9459l;
import net.coocent.android.xmlparser.C9483n;
import net.coocent.android.xmlparser.C9502v;
import p391j.p392a.p393a.C8614g;
import p391j.p392a.p393a.C8615h;

/* renamed from: net.coocent.android.xmlparser.gift.d */
/* compiled from: GiftAdapter */
public class C9438d extends RecyclerView.C0797h<C9440b> {

    /* renamed from: a */
    private List<C9483n> f36365a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9441c f36366b;

    /* renamed from: net.coocent.android.xmlparser.gift.d$a */
    /* compiled from: GiftAdapter */
    class C9439a implements C9459l.C9460a {

        /* renamed from: a */
        final /* synthetic */ C9440b f36367a;

        C9439a(C9438d dVar, C9440b bVar) {
            this.f36367a = bVar;
        }

        /* renamed from: a */
        public void mo32567a(Bitmap bitmap) {
            if (bitmap != null) {
                this.f36367a.f36369h.setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.gift.d$b */
    /* compiled from: GiftAdapter */
    class C9440b extends RecyclerView.C0792c0 implements View.OnClickListener {

        /* renamed from: g */
        RelativeLayout f36368g;

        /* renamed from: h */
        AppCompatImageView f36369h;

        /* renamed from: i */
        AppCompatImageView f36370i;

        /* renamed from: j */
        AppCompatButton f36371j;

        /* renamed from: k */
        TextView f36372k;

        /* renamed from: l */
        TextView f36373l;

        C9440b(View view) {
            super(view);
            this.f36368g = (RelativeLayout) view.findViewById(C8614g.rl_item);
            this.f36369h = (AppCompatImageView) view.findViewById(C8614g.iv_icon);
            this.f36370i = (AppCompatImageView) view.findViewById(C8614g.iv_new);
            this.f36371j = (AppCompatButton) view.findViewById(C8614g.btn_install);
            this.f36372k = (TextView) view.findViewById(C8614g.tv_title);
            this.f36373l = (TextView) view.findViewById(C8614g.tv_description);
            this.f36368g.setOnClickListener(this);
            this.f36371j.setOnClickListener(this);
        }

        public void onClick(View view) {
            if (C9438d.this.f36366b != null) {
                C9438d.this.f36366b.mo32558a(view, getLayoutPosition());
            }
        }
    }

    /* renamed from: net.coocent.android.xmlparser.gift.d$c */
    /* compiled from: GiftAdapter */
    public interface C9441c {
        /* renamed from: a */
        void mo32558a(View view, int i);
    }

    /* renamed from: d */
    public C9483n mo32562d(int i) {
        return this.f36365a.get(i);
    }

    /* renamed from: e */
    public void onBindViewHolder(C9440b bVar, int i) {
        C9483n d = mo32562d(i);
        if (d != null) {
            bVar.f36372k.setText(d.mo32696h());
            bVar.f36373l.setText(d.mo32690b());
            bVar.f36373l.setSelected(true);
            int i2 = 8;
            if (i >= 5) {
                bVar.f36370i.setVisibility(8);
            } else {
                AppCompatImageView appCompatImageView = bVar.f36370i;
                if (C9502v.m49951v(d.mo32695g())) {
                    i2 = 0;
                }
                appCompatImageView.setVisibility(i2);
            }
            String e = d.mo32693e();
            C9459l.m49807b(e, C9502v.f36501e + d.mo32695g(), new C9439a(this, bVar));
        }
    }

    /* renamed from: f */
    public C9440b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C9440b(LayoutInflater.from(viewGroup.getContext()).inflate(C8615h.item_gift_list, viewGroup, false));
    }

    /* renamed from: g */
    public void mo32565g(C9441c cVar) {
        this.f36366b = cVar;
    }

    public int getItemCount() {
        return this.f36365a.size();
    }

    /* renamed from: h */
    public void mo32566h(List<C9483n> list) {
        this.f36365a = list;
        notifyItemRangeChanged(0, list.size());
    }
}
