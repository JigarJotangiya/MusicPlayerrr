package coocent.music.player.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import media.musicplayer.audioplayer.videoplayer.R;

/* renamed from: coocent.music.player.widget.f */
/* compiled from: EditPersetDialog */
public class C7186f extends Dialog {

    /* renamed from: g */
    private Context f31819g;

    /* renamed from: h */
    String f31820h;

    /* renamed from: i */
    EditText f31821i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7188b f31822j;

    /* renamed from: coocent.music.player.widget.f$a */
    /* compiled from: EditPersetDialog */
    class C7187a implements View.OnClickListener {
        C7187a() {
        }

        public void onClick(View view) {
            C7186f.this.dismiss();
        }
    }

    /* renamed from: coocent.music.player.widget.f$b */
    /* compiled from: EditPersetDialog */
    public interface C7188b {
        /* renamed from: a */
        void mo27570a();

        /* renamed from: b */
        void mo27571b(String str, EditText editText);
    }

    /* renamed from: coocent.music.player.widget.f$c */
    /* compiled from: EditPersetDialog */
    private class C7189c implements View.OnClickListener {
        private C7189c() {
        }

        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.delete) {
                C7186f.this.f31822j.mo27570a();
            } else if (id == R.id.save) {
                C7186f.this.f31822j.mo27571b(C7186f.this.f31821i.getText().toString(), C7186f.this.f31821i);
            }
        }

        /* synthetic */ C7189c(C7186f fVar, C7187a aVar) {
            this();
        }
    }

    public C7186f(Context context, String str) {
        super(context);
        this.f31819g = context;
        this.f31820h = str;
    }

    /* renamed from: b */
    public void mo27718b() {
        View inflate = LayoutInflater.from(this.f31819g).inflate(R.layout.edit_preset, (ViewGroup) null);
        setContentView(inflate);
        ((ImageView) inflate.findViewById(R.id.cancel)).setOnClickListener(new C7187a());
        ((TextView) inflate.findViewById(R.id.save)).setOnClickListener(new C7189c(this, (C7187a) null));
        ((TextView) inflate.findViewById(R.id.delete)).setOnClickListener(new C7189c(this, (C7187a) null));
        EditText editText = (EditText) inflate.findViewById(R.id.rename_etv);
        this.f31821i = editText;
        editText.setSelection(editText.getText().length());
        this.f31821i.setText(this.f31820h);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = this.f31819g.getResources().getDisplayMetrics().widthPixels;
        window.setAttributes(attributes);
    }

    /* renamed from: c */
    public void mo27719c(C7188b bVar) {
        this.f31822j = bVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo27718b();
    }
}
