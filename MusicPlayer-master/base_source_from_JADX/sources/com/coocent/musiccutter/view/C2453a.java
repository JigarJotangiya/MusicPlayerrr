package com.coocent.musiccutter.view;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0584b;
import com.coocent.musiccutter.view.WheelView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import p159f.p166c.p199f.C4490d;
import p159f.p166c.p199f.C4491e;
import p159f.p166c.p199f.C4492f;
import p159f.p166c.p199f.C4493g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.musiccutter.view.a */
/* compiled from: SetTimeFragmentDialog */
public class C2453a extends C0584b implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public int f8612A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public int f8613B0;

    /* renamed from: C0 */
    private int f8614C0;

    /* renamed from: D0 */
    private int f8615D0;

    /* renamed from: E0 */
    private int f8616E0;

    /* renamed from: F0 */
    private int f8617F0;

    /* renamed from: G0 */
    private int f8618G0;

    /* renamed from: H0 */
    private int f8619H0;

    /* renamed from: I0 */
    private int f8620I0;

    /* renamed from: J0 */
    private C2456c f8621J0;

    /* renamed from: q0 */
    private TextView f8622q0;

    /* renamed from: r0 */
    private ImageView f8623r0;

    /* renamed from: s0 */
    private TextView f8624s0;

    /* renamed from: t0 */
    private WheelView f8625t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public WheelView f8626u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public WheelView f8627v0;

    /* renamed from: w0 */
    private String f8628w0;

    /* renamed from: x0 */
    private double f8629x0 = 0.0d;

    /* renamed from: y0 */
    private double f8630y0 = 0.0d;

    /* renamed from: z0 */
    private double f8631z0 = 0.0d;

    /* renamed from: com.coocent.musiccutter.view.a$a */
    /* compiled from: SetTimeFragmentDialog */
    class C2454a implements WheelView.C2452c {
        C2454a() {
        }

        /* renamed from: a */
        public void mo9512a(int i, String str) {
            int unused = C2453a.this.f8612A0 = Integer.parseInt(str);
            C2453a aVar = C2453a.this;
            C2453a.this.f8626u0.setItems(aVar.m11491u3(aVar.f8612A0));
            C2453a.this.f8626u0.setSeletion(0);
            C2453a aVar2 = C2453a.this;
            C2453a.this.f8627v0.setItems(aVar2.m11488r3(aVar2.f8612A0, 0));
            C2453a.this.f8627v0.setSeletion(0);
        }
    }

    /* renamed from: com.coocent.musiccutter.view.a$b */
    /* compiled from: SetTimeFragmentDialog */
    class C2455b implements WheelView.C2452c {
        C2455b() {
        }

        /* renamed from: a */
        public void mo9512a(int i, String str) {
            int unused = C2453a.this.f8613B0 = Integer.parseInt(str);
            C2453a aVar = C2453a.this;
            C2453a.this.f8627v0.setItems(aVar.m11488r3(aVar.f8612A0, C2453a.this.f8613B0));
            C2453a.this.f8627v0.setSeletion(0);
        }
    }

    /* renamed from: com.coocent.musiccutter.view.a$c */
    /* compiled from: SetTimeFragmentDialog */
    public interface C2456c {
        /* renamed from: a */
        void mo9403a(double d);
    }

    /* renamed from: q3 */
    private void m11487q3() {
        double d;
        double d2;
        double d3;
        Bundle V = mo3638V();
        if (V != null) {
            this.f8629x0 = V.getDouble("curTime", 0.0d);
            this.f8630y0 = V.getDouble("minTime", 0.0d);
            this.f8631z0 = V.getDouble("maxTime", 0.0d);
            this.f8628w0 = V.getString("title", mo3582D0(C4492f.set_start));
        }
        this.f8612A0 = (int) (this.f8629x0 / 60.0d);
        try {
            d = new BigDecimal(this.f8629x0 % 60.0d).setScale(1, 4).doubleValue();
        } catch (NumberFormatException unused) {
            d = this.f8629x0 % 60.0d;
        }
        this.f8613B0 = (int) d;
        this.f8614C0 = (int) ((d * 10.0d) % 10.0d);
        this.f8615D0 = (int) (this.f8630y0 / 60.0d);
        try {
            d2 = new BigDecimal(this.f8630y0 % 60.0d).setScale(1, 4).doubleValue();
        } catch (NumberFormatException unused2) {
            d2 = this.f8630y0 % 60.0d;
        }
        this.f8616E0 = (int) d2;
        this.f8617F0 = (int) ((d2 * 10.0d) % 10.0d);
        this.f8618G0 = (int) (this.f8631z0 / 60.0d);
        try {
            d3 = new BigDecimal(this.f8631z0 % 60.0d).setScale(1, 4).doubleValue();
        } catch (NumberFormatException unused3) {
            d3 = this.f8631z0 % 60.0d;
        }
        this.f8619H0 = (int) d3;
        this.f8620I0 = (int) ((d3 * 10.0d) % 10.0d);
        this.f8622q0.setText(this.f8628w0);
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public List<String> m11488r3(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int i3 = (i < this.f8618G0 || i2 < this.f8619H0) ? 9 : this.f8620I0;
        for (int i4 = (i > this.f8615D0 || i2 > this.f8616E0) ? 0 : this.f8617F0; i4 <= i3; i4++) {
            arrayList.add(i4 + BuildConfig.FLAVOR);
        }
        return arrayList;
    }

    /* renamed from: s3 */
    private List<String> m11489s3() {
        String str;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        for (int i = this.f8615D0; i <= this.f8618G0; i++) {
            if (i < 10) {
                sb = new StringBuilder();
                str = "0";
            } else {
                sb = new StringBuilder();
                str = BuildConfig.FLAVOR;
            }
            sb.append(str);
            sb.append(i);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* renamed from: t3 */
    private int m11490t3(List<String> list, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            if (!TextUtils.equals(list.get(i2), BuildConfig.FLAVOR + i)) {
                if (!TextUtils.equals(list.get(i2), "0" + i)) {
                    i2++;
                }
            }
            return i2;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public List<String> m11491u3(int i) {
        String str;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int i2 = i >= this.f8618G0 ? this.f8619H0 : 59;
        for (int i3 = i <= this.f8615D0 ? this.f8616E0 : 0; i3 <= i2; i3++) {
            if (i3 < 10) {
                sb = new StringBuilder();
                str = "0";
            } else {
                sb = new StringBuilder();
                str = BuildConfig.FLAVOR;
            }
            sb.append(str);
            sb.append(i3);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* renamed from: v3 */
    private void m11492v3() {
        List<String> s3 = m11489s3();
        this.f8625t0.setOffset(2);
        this.f8625t0.setItems(s3);
        this.f8625t0.setSeletion(m11490t3(s3, this.f8612A0));
        List<String> u3 = m11491u3(this.f8612A0);
        this.f8626u0.setOffset(2);
        this.f8626u0.setItems(u3);
        this.f8626u0.setSeletion(m11490t3(u3, this.f8613B0));
        List<String> r3 = m11488r3(this.f8612A0, this.f8613B0);
        this.f8627v0.setOffset(2);
        this.f8627v0.setItems(r3);
        this.f8627v0.setSeletion(m11490t3(r3, this.f8614C0));
    }

    /* renamed from: w3 */
    private void m11493w3() {
        this.f8623r0.setOnClickListener(this);
        this.f8624s0.setOnClickListener(this);
        this.f8625t0.setOnWheelViewListener(new C2454a());
        this.f8626u0.setOnWheelViewListener(new C2455b());
    }

    /* renamed from: x3 */
    public static C2453a m11494x3(double d, double d2, double d3, String str) {
        C2453a aVar = new C2453a();
        Bundle bundle = new Bundle();
        bundle.putDouble("curTime", d);
        bundle.putDouble("minTime", d2);
        bundle.putDouble("maxTime", d3);
        bundle.putString("title", str);
        aVar.mo3581C2(bundle);
        return aVar;
    }

    /* renamed from: S1 */
    public void mo3630S1() {
        super.mo3630S1();
        Window window = mo3834a3().getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.getAttributes().windowAnimations = C4493g.bottom_to_top;
        mo3606L().getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
    }

    /* renamed from: U1 */
    public void mo3636U1(View view, Bundle bundle) {
        super.mo3636U1(view, bundle);
        this.f8622q0 = (TextView) view.findViewById(C4490d.tv_title);
        this.f8623r0 = (ImageView) view.findViewById(C4490d.iv_finish);
        this.f8624s0 = (TextView) view.findViewById(C4490d.tv_cancel);
        this.f8625t0 = (WheelView) view.findViewById(C4490d.wv_min);
        this.f8626u0 = (WheelView) view.findViewById(C4490d.wv_sec);
        this.f8627v0 = (WheelView) view.findViewById(C4490d.wv_dec);
        m11487q3();
        m11492v3();
        m11493w3();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C4490d.iv_finish) {
            this.f8612A0 = Integer.parseInt(this.f8625t0.getSeletedItem());
            this.f8613B0 = Integer.parseInt(this.f8626u0.getSeletedItem());
            int parseInt = Integer.parseInt(this.f8627v0.getSeletedItem());
            this.f8614C0 = parseInt;
            double d = ((double) ((this.f8612A0 * 60) + this.f8613B0)) + (((double) parseInt) * 0.1d);
            C2456c cVar = this.f8621J0;
            if (cVar != null) {
                cVar.mo9403a(d);
            }
            mo3831X2();
        } else if (id == C4490d.tv_cancel) {
            mo3831X2();
        }
    }

    /* renamed from: t1 */
    public View mo3701t1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C4491e.dialog_set_time_fragment, viewGroup, false);
    }

    /* renamed from: y3 */
    public C2453a mo9514y3(C2456c cVar) {
        this.f8621J0 = cVar;
        return this;
    }
}
