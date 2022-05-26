package coocent.musiclibrary.music.p284e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;
import p342g.p359b.C8354h;

/* renamed from: coocent.musiclibrary.music.e.e */
/* compiled from: DefaultTipDialog */
public class C7332e extends Dialog {

    /* renamed from: g */
    private Context f32329g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7334b f32330h;

    /* renamed from: i */
    private String f32331i;

    /* renamed from: j */
    private String f32332j;

    /* renamed from: k */
    private int f32333k;

    /* renamed from: l */
    private int f32334l;

    /* renamed from: m */
    private int f32335m;

    /* renamed from: n */
    private boolean f32336n;

    /* renamed from: o */
    private String f32337o;

    /* renamed from: p */
    private String f32338p;

    /* renamed from: q */
    private String f32339q;

    /* renamed from: coocent.musiclibrary.music.e.e$b */
    /* compiled from: DefaultTipDialog */
    public interface C7334b {
        /* renamed from: a */
        void mo26720a();

        /* renamed from: b */
        void mo26721b();

        /* renamed from: c */
        void mo26722c();
    }

    /* renamed from: coocent.musiclibrary.music.e.e$c */
    /* compiled from: DefaultTipDialog */
    private class C7335c implements View.OnClickListener {
        private C7335c() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == C8350d.button3) {
                C7332e.this.f32330h.mo26721b();
            } else if (id == C8350d.button2) {
                C7332e.this.f32330h.mo26720a();
            } else if (id == C8350d.button1) {
                C7332e.this.f32330h.mo26722c();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7332e(Context context, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z, boolean z2) {
        super(context, z ? C8354h.dialog : 0);
        this.f32329g = context;
        this.f32331i = str4;
        this.f32332j = str5;
        this.f32333k = i;
        this.f32334l = i2;
        this.f32335m = i3;
        this.f32336n = z2;
        this.f32337o = str;
        this.f32338p = str2;
        this.f32339q = str3;
    }

    /* renamed from: b */
    public void mo28070b() {
        View inflate = LayoutInflater.from(this.f32329g).inflate(C8351e.dialog_default_tip, (ViewGroup) null);
        setContentView(inflate);
        ((LinearLayout) inflate.findViewById(C8350d.dialog_bg)).setBackgroundColor(this.f32335m);
        TextView textView = (TextView) inflate.findViewById(C8350d.button3);
        TextView textView2 = (TextView) inflate.findViewById(C8350d.button2);
        TextView textView3 = (TextView) inflate.findViewById(C8350d.button1);
        String str = this.f32337o;
        if (str != null && !str.isEmpty()) {
            textView3.setText(this.f32337o);
        }
        String str2 = this.f32338p;
        if (str2 != null && !str2.isEmpty()) {
            textView2.setText(this.f32338p);
        }
        String str3 = this.f32339q;
        if (str3 != null && !str3.isEmpty()) {
            textView.setText(this.f32339q);
        }
        if (!this.f32336n) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
        }
        TextView textView4 = (TextView) inflate.findViewById(C8350d.title);
        textView4.setText(this.f32331i);
        TextView textView5 = (TextView) inflate.findViewById(C8350d.content);
        textView5.setText(this.f32332j);
        textView4.setTextColor(this.f32334l);
        textView5.setTextColor(this.f32334l);
        textView.setOnClickListener(new C7335c());
        textView2.setOnClickListener(new C7335c());
        textView3.setOnClickListener(new C7335c());
        textView.setTextColor(this.f32333k);
        textView2.setTextColor(this.f32333k);
        textView3.setTextColor(this.f32333k);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = this.f32329g.getResources().getDisplayMetrics().widthPixels;
        window.setAttributes(attributes);
    }

    /* renamed from: c */
    public void mo28071c(C7334b bVar) {
        this.f32330h = bVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo28070b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7332e(Context context, String str, String str2, int i, int i2, int i3, boolean z) {
        super(context, z ? C8354h.dialog : 0);
        this.f32329g = context;
        this.f32331i = str;
        this.f32332j = str2;
        this.f32333k = i;
        this.f32334l = i2;
        this.f32335m = i3;
    }
}
