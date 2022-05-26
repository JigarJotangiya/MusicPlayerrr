package coocent.musiclibrary.music.p284e;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import p342g.p359b.C8350d;
import p342g.p359b.C8351e;
import p342g.p359b.C8354h;

/* renamed from: coocent.musiclibrary.music.e.g */
/* compiled from: ModifyInfoDialog */
public class C7340g extends Dialog {

    /* renamed from: g */
    private int f32352g;

    /* renamed from: h */
    private int f32353h;

    /* renamed from: i */
    private int f32354i;

    /* renamed from: j */
    private final Context f32355j;

    /* renamed from: k */
    EditText f32356k;

    /* renamed from: l */
    EditText f32357l;

    /* renamed from: m */
    EditText f32358m;

    /* renamed from: n */
    TextView f32359n;

    /* renamed from: o */
    TextView f32360o;

    /* renamed from: p */
    TextView f32361p;

    /* renamed from: q */
    String f32362q;

    /* renamed from: r */
    String f32363r;

    /* renamed from: s */
    String f32364s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C7342b f32365t;

    /* renamed from: coocent.musiclibrary.music.e.g$b */
    /* compiled from: ModifyInfoDialog */
    public interface C7342b {
        /* renamed from: a */
        void mo27784a(Dialog dialog, String str, String str2, String str3);

        /* renamed from: b */
        void mo27785b(Dialog dialog);
    }

    /* renamed from: coocent.musiclibrary.music.e.g$c */
    /* compiled from: ModifyInfoDialog */
    private class C7343c implements View.OnClickListener {
        private C7343c() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == C8350d.comfirm) {
                C7342b a = C7340g.this.f32365t;
                C7340g gVar = C7340g.this;
                a.mo27784a(gVar, gVar.f32356k.getText().toString(), C7340g.this.f32357l.getText().toString(), C7340g.this.f32358m.getText().toString());
            } else if (id == C8350d.cancel) {
                C7340g.this.f32365t.mo27785b(C7340g.this);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7340g(Context context, String str, String str2, String str3, int i, int i2, int i3, boolean z) {
        super(context, z ? C8354h.dialog : 0);
        this.f32352g = 0;
        this.f32353h = 0;
        this.f32354i = 0;
        this.f32355j = context;
        this.f32362q = str;
        this.f32363r = str3;
        this.f32364s = str2;
        this.f32352g = i;
        this.f32353h = i2;
        this.f32354i = i3;
    }

    /* renamed from: b */
    public void mo28080b() {
        View inflate = LayoutInflater.from(this.f32355j).inflate(C8351e.music_modify_info_dialog, (ViewGroup) null);
        int i = this.f32352g;
        if (i != 0) {
            inflate.setBackgroundColor(i);
        }
        setContentView(inflate);
        ((TextView) inflate.findViewById(C8350d.comfirm)).setOnClickListener(new C7343c());
        ((TextView) inflate.findViewById(C8350d.cancel)).setOnClickListener(new C7343c());
        ((TextView) inflate.findViewById(C8350d.edit_title)).setTextColor(this.f32354i);
        EditText editText = (EditText) inflate.findViewById(C8350d.tv_title);
        this.f32356k = editText;
        editText.setText(this.f32362q);
        EditText editText2 = this.f32356k;
        editText2.setSelection(editText2.getText().length());
        EditText editText3 = (EditText) inflate.findViewById(C8350d.tv_album);
        this.f32357l = editText3;
        editText3.setText(this.f32363r);
        EditText editText4 = (EditText) inflate.findViewById(C8350d.tv_artist);
        this.f32358m = editText4;
        editText4.setText(this.f32364s);
        this.f32359n = (TextView) inflate.findViewById(C8350d.first_tv_title);
        this.f32360o = (TextView) inflate.findViewById(C8350d.tv_first_artist);
        this.f32361p = (TextView) inflate.findViewById(C8350d.tv_first_album);
        this.f32359n.setTextColor(this.f32353h);
        this.f32360o.setTextColor(this.f32353h);
        this.f32361p.setTextColor(this.f32353h);
        this.f32356k.setTextColor(this.f32353h);
        this.f32357l.setTextColor(this.f32353h);
        this.f32358m.setTextColor(this.f32353h);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = this.f32355j.getResources().getDisplayMetrics().widthPixels;
        window.setAttributes(attributes);
    }

    /* renamed from: c */
    public void mo28081c(C7342b bVar) {
        this.f32365t = bVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo28080b();
    }
}
