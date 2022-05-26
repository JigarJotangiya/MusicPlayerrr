package p159f.p166c.p181e.p182a.p183a.p188e;

import android.content.Context;
import android.os.Environment;
import com.coocent.music.base.data.entity.Music;
import java.io.File;
import java.util.List;
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.e.g */
/* compiled from: FolderMusicLoader.kt */
public final class C4416g {

    /* renamed from: a */
    public static final C4416g f12998a = new C4416g();

    private C4416g() {
    }

    /* renamed from: b */
    private final String m19312b(Context context) {
        if (C4434c.f13013c.mo15048a0()) {
            C4441e n = C4441e.m19454n(context);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String t = n.mo15126t();
            C8594l.m46770d(t, "MusicPreference.getInsta…e(context).trackSortOrder");
            return t;
        }
        C4441e n2 = C4441e.m19454n(context);
        C8594l.m46770d(n2, "MusicPreference.getInstance(context)");
        String k = n2.mo15119k();
        C8594l.m46770d(k, "MusicPreference.getInsta…ext).folderTrackSortOrder");
        return k;
    }

    /* renamed from: a */
    public final List<Music> mo14982a(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "path");
        StringBuilder sb = new StringBuilder();
        sb.append("_data" + " LIKE '" + str + "%'");
        return C8490t.m46678C(C4423k.m19333l(context, sb.toString(), m19312b(context), true, true, str));
    }

    /* renamed from: c */
    public final List<Music> mo14983c(Context context) {
        C8594l.m46771e(context, "context");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("_data");
        sb2.append(" LIKE '");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
        C8594l.m46770d(externalStoragePublicDirectory, "Environment.getExternalS…        .DIRECTORY_MUSIC)");
        sb2.append(externalStoragePublicDirectory.getPath());
        sb2.append(File.separator);
        sb2.append("Music Cutter");
        sb2.append("%'");
        sb.append(sb2.toString());
        return C4423k.m19336p(context, sb.toString(), m19312b(context), false, false, (String) null, 48, (Object) null);
    }
}
