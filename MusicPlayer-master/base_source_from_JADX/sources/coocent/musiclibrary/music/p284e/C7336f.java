package coocent.musiclibrary.music.p284e;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import coocent.musiclibrary.music.p292j.C7390f;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;
import p342g.p359b.C8354h;

/* renamed from: coocent.musiclibrary.music.e.f */
/* compiled from: DetailDialog */
public class C7336f extends Dialog {

    /* renamed from: g */
    private final int f32341g;

    /* renamed from: h */
    private final int f32342h;

    /* renamed from: i */
    private final Context f32343i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7338b f32344j;

    /* renamed from: k */
    private final String f32345k;

    /* renamed from: l */
    private final String f32346l;

    /* renamed from: m */
    private final String f32347m;

    /* renamed from: n */
    private final String f32348n;

    /* renamed from: o */
    private final int f32349o;

    /* renamed from: p */
    private int f32350p;

    /* renamed from: coocent.musiclibrary.music.e.f$b */
    /* compiled from: DetailDialog */
    public interface C7338b {
        /* renamed from: a */
        void mo28077a();

        /* renamed from: b */
        void mo28078b();
    }

    /* renamed from: coocent.musiclibrary.music.e.f$c */
    /* compiled from: DetailDialog */
    private class C7339c implements View.OnClickListener {
        private C7339c() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == C8350d.edit) {
                C7336f.this.f32344j.mo28078b();
            } else if (id == C8350d.cancel) {
                C7336f.this.f32344j.mo28077a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7336f(Context context, String str, String str2, String str3, int i, String str4, int i2, int i3, int i4, boolean z) {
        super(context, z ? C8354h.dialog : 0);
        this.f32350p = 0;
        this.f32343i = context;
        this.f32345k = str;
        this.f32346l = str2;
        this.f32347m = str3;
        this.f32349o = i;
        this.f32348n = str4;
        this.f32350p = i2;
        this.f32341g = i4;
        this.f32342h = i3;
    }

    /* renamed from: b */
    private String m41507b(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 1000;
        if (i2 > 60) {
            sb.append(i2 / 60);
            sb.append(":");
            i2 %= 60;
        } else {
            sb.append("0:");
        }
        if (i2 < 10) {
            sb.append("0");
        }
        sb.append(i2);
        return sb.toString();
    }

    @SuppressLint({"SetTextI18n"})
    /* renamed from: c */
    public void mo28074c() {
        double d;
        View inflate = LayoutInflater.from(this.f32343i).inflate(C8351e.music_detail_dialog, (ViewGroup) null);
        int i = this.f32350p;
        if (i != 0) {
            inflate.setBackgroundColor(i);
        }
        setContentView(inflate);
        ((TextView) inflate.findViewById(C8350d.tv_detail_title)).setTextColor(this.f32342h);
        ((TextView) inflate.findViewById(C8350d.edit)).setOnClickListener(new C7339c());
        ((TextView) inflate.findViewById(C8350d.cancel)).setOnClickListener(new C7339c());
        TextView textView = (TextView) inflate.findViewById(C8350d.tv_title);
        textView.setText(this.f32345k);
        textView.setTextColor(this.f32341g);
        TextView textView2 = (TextView) inflate.findViewById(C8350d.tv_album);
        textView2.setText(this.f32347m);
        TextView textView3 = (TextView) inflate.findViewById(C8350d.tv_artist);
        textView3.setText(this.f32346l);
        TextView textView4 = (TextView) inflate.findViewById(C8350d.tv_time);
        textView4.setText(m41507b(this.f32349o));
        TextView textView5 = (TextView) inflate.findViewById(C8350d.tv_size);
        try {
            d = C7390f.m41687b(this.f32348n, 3);
        } catch (Exception unused) {
            d = 0.0d;
        }
        textView5.setText(d + "MB");
        TextView textView6 = (TextView) inflate.findViewById(C8350d.tv_path);
        textView6.setText(this.f32348n);
        ((TextView) findViewById(C8350d.first_tv_title)).setTextColor(this.f32342h);
        ((TextView) findViewById(C8350d.first_tv_album)).setTextColor(this.f32342h);
        ((TextView) findViewById(C8350d.first_tv_artist)).setTextColor(this.f32342h);
        ((TextView) findViewById(C8350d.first_tv_time)).setTextColor(this.f32342h);
        ((TextView) findViewById(C8350d.first_tv_size)).setTextColor(this.f32342h);
        ((TextView) findViewById(C8350d.first_tv_path)).setTextColor(this.f32342h);
        textView2.setTextColor(this.f32342h);
        textView3.setTextColor(this.f32342h);
        textView4.setTextColor(this.f32342h);
        textView5.setTextColor(this.f32342h);
        textView6.setTextColor(this.f32342h);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = this.f32343i.getResources().getDisplayMetrics().widthPixels;
        window.setAttributes(attributes);
    }

    /* renamed from: d */
    public void mo28075d(C7338b bVar) {
        this.f32344j = bVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo28074c();
    }
}
