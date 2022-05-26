package p159f.p166c.p218l.p219e;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.coocent.sleeptimer.view.WheelView;
import java.util.ArrayList;
import java.util.List;
import p159f.p166c.p218l.C4602b;
import p159f.p166c.p218l.C4603c;
import p159f.p166c.p218l.p220f.C4611a;
import p159f.p166c.p218l.p221g.C4612a;

/* renamed from: f.c.l.e.a */
/* compiled from: CustomTimeDialog */
public class C4605a extends C4610b {

    /* renamed from: g */
    private CardView f13306g;

    /* renamed from: h */
    private TextView f13307h;

    /* renamed from: i */
    private TextView f13308i;

    /* renamed from: j */
    private TextView f13309j;

    /* renamed from: k */
    private TextView f13310k;

    /* renamed from: l */
    private TextView f13311l;

    /* renamed from: m */
    private TextView f13312m;

    /* renamed from: n */
    private View f13313n;

    /* renamed from: o */
    private View f13314o;

    /* renamed from: p */
    private View f13315p;

    /* renamed from: q */
    private View f13316q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public WheelView f13317r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public WheelView f13318s;

    /* renamed from: t */
    private int f13319t;

    /* renamed from: u */
    private int f13320u;

    /* renamed from: v */
    private int f13321v;

    /* renamed from: w */
    private int f13322w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C4611a f13323x;

    /* renamed from: f.c.l.e.a$a */
    /* compiled from: CustomTimeDialog */
    class C4606a implements WheelView.C2519c {
        C4606a() {
        }

        /* renamed from: a */
        public void mo9738a(int i, String str) {
            C4605a.this.m20052j();
        }
    }

    /* renamed from: f.c.l.e.a$b */
    /* compiled from: CustomTimeDialog */
    class C4607b implements WheelView.C2519c {
        C4607b() {
        }

        /* renamed from: a */
        public void mo9738a(int i, String str) {
            C4605a.this.m20052j();
        }
    }

    /* renamed from: f.c.l.e.a$c */
    /* compiled from: CustomTimeDialog */
    class C4608c implements View.OnClickListener {
        C4608c() {
        }

        public void onClick(View view) {
            C4605a.this.dismiss();
        }
    }

    /* renamed from: f.c.l.e.a$d */
    /* compiled from: CustomTimeDialog */
    class C4609d implements View.OnClickListener {
        C4609d() {
        }

        public void onClick(View view) {
            long seletedIndex = (long) (((C4605a.this.f13317r.getSeletedIndex() * 60) + C4605a.this.f13318s.getSeletedIndex()) * 60 * 1000);
            if (C4605a.this.f13323x != null) {
                C4605a.this.f13323x.mo15354a(seletedIndex);
            }
            C4605a.this.dismiss();
        }
    }

    public C4605a(Context context, int i, int i2, int i3, int i4) {
        super(context);
        this.f13319t = i;
        this.f13320u = i2;
        this.f13321v = i3;
        this.f13322w = i4;
    }

    /* renamed from: g */
    private List<String> m20049g() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= 23; i++) {
            arrayList.add(String.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: h */
    private List<String> m20050h() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i <= 59; i++) {
            arrayList.add(String.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: i */
    private void m20051i() {
        this.f13317r.setOnWheelViewListener(new C4606a());
        this.f13318s.setOnWheelViewListener(new C4607b());
        this.f13311l.setOnClickListener(new C4608c());
        this.f13312m.setOnClickListener(new C4609d());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m20052j() {
        this.f13312m.setEnabled((this.f13317r.getSeletedIndex() == 0 && this.f13318s.getSeletedIndex() == 0) ? false : true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo15347a() {
        return C4603c.dialog_custom_time;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15348b(View view) {
        this.f13306g = (CardView) view.findViewById(C4602b.dialog_layout);
        this.f13307h = (TextView) view.findViewById(C4602b.tv_title);
        this.f13308i = (TextView) view.findViewById(C4602b.tv_hour);
        this.f13309j = (TextView) view.findViewById(C4602b.tv_colon);
        this.f13310k = (TextView) view.findViewById(C4602b.tv_minute);
        this.f13311l = (TextView) view.findViewById(C4602b.tv_cancel);
        this.f13312m = (TextView) view.findViewById(C4602b.tv_confirm);
        this.f13313n = view.findViewById(C4602b.line1);
        this.f13314o = view.findViewById(C4602b.line2);
        this.f13315p = view.findViewById(C4602b.line3);
        this.f13316q = view.findViewById(C4602b.line4);
        this.f13317r = (WheelView) view.findViewById(C4602b.wv_hour);
        this.f13318s = (WheelView) view.findViewById(C4602b.wv_minute);
        this.f13306g.setCardBackgroundColor(this.f13319t);
        this.f13307h.setTextColor(this.f13320u);
        this.f13308i.setTextColor(this.f13321v);
        this.f13309j.setTextColor(this.f13321v);
        this.f13310k.setTextColor(this.f13321v);
        this.f13311l.setTextColor(this.f13322w);
        C4612a.m20061a(this.f13312m, this.f13321v, this.f13322w);
        this.f13313n.setBackgroundColor(this.f13321v);
        this.f13314o.setBackgroundColor(this.f13321v);
        this.f13315p.setBackgroundColor(this.f13321v);
        this.f13316q.setBackgroundColor(this.f13321v);
        this.f13317r.setOffset(1);
        this.f13317r.mo9725i(this.f13322w, this.f13321v);
        this.f13317r.setItems(m20049g());
        this.f13317r.setSeletion(0);
        this.f13318s.setOffset(1);
        this.f13318s.mo9725i(this.f13322w, this.f13321v);
        this.f13318s.setItems(m20050h());
        this.f13318s.setSeletion(0);
        m20051i();
    }

    /* renamed from: k */
    public C4605a mo15349k(C4611a aVar) {
        this.f13323x = aVar;
        return this;
    }
}
