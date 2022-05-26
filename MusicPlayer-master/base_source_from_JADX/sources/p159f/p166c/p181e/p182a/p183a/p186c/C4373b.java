package p159f.p166c.p181e.p182a.p183a.p186c;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import p159f.p166c.p181e.p182a.p183a.p184a.C4363c;
import p159f.p166c.p181e.p182a.p183a.p187d.C4378c;
import p159f.p166c.p181e.p182a.p183a.p188e.C4423k;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.a.c.b */
/* compiled from: BelowQ.kt */
public final class C4373b {
    /* renamed from: a */
    public static final void m19086a(Object obj, long j, String str, ContentValues contentValues, C4363c cVar) {
        Context context;
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(str, "oldTitle");
        C8594l.m46771e(contentValues, "contentValues");
        if (obj instanceof Activity) {
            context = (Context) obj;
        } else {
            context = obj instanceof Fragment ? ((Fragment) obj).mo3708v2() : null;
        }
        if (context != null) {
            int C = C4423k.m19326C(context, j, contentValues);
            if (cVar == null) {
                return;
            }
            if (C >= 1) {
                String asString = contentValues.getAsString("title");
                String asString2 = contentValues.getAsString("album");
                String asString3 = contentValues.getAsString("artist");
                C4378c cVar2 = C4378c.f12969c;
                C8594l.m46770d(asString, "title");
                boolean e = cVar2.mo14935e(str, asString);
                Log.e(AudioPlayService.KEY_RENAME, "renameResult:" + e);
                cVar.mo14801a(true, j, asString, asString2, asString3);
                return;
            }
            cVar.mo14801a(false, j, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR);
        }
    }
}
