package coocent.musiclibrary.music.p292j;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import coocent.musiclibrary.music.p281b.C7322a;
import p342g.p359b.C8353g;

/* renamed from: coocent.musiclibrary.music.j.e */
/* compiled from: DialogUtils */
public class C7387e {

    /* renamed from: coocent.musiclibrary.music.j.e$a */
    /* compiled from: DialogUtils */
    class C7388a implements DialogInterface.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ C7322a f32476g;

        C7388a(C7322a aVar) {
            this.f32476g = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f32476g.mo26686a(dialogInterface);
        }
    }

    /* renamed from: coocent.musiclibrary.music.j.e$b */
    /* compiled from: DialogUtils */
    class C7389b implements DialogInterface.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ C7322a f32477g;

        C7389b(C7322a aVar) {
            this.f32477g = aVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f32477g.mo26687b(dialogInterface);
        }
    }

    /* renamed from: a */
    public static void m41685a(Context context, C7322a aVar) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(C8353g.requet_permission);
        builder.setMessage(C8353g.request_rwfile_permission);
        builder.setCancelable(false);
        builder.setPositiveButton(C8353g.f34799ok, new C7388a(aVar));
        builder.setNegativeButton(C8353g.cancel, new C7389b(aVar));
        builder.show();
    }
}
