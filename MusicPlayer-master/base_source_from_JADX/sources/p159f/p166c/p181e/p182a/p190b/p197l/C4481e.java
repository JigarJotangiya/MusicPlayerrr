package p159f.p166c.p181e.p182a.p190b.p197l;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.b.l.e */
/* compiled from: UtilsKit.kt */
public final class C4481e {
    /* renamed from: a */
    public static final int m19677a(int i, float f) {
        return (Math.min(255, Math.max(0, (int) (f * ((float) 255)))) << 24) + (i & 16777215);
    }

    /* renamed from: b */
    public static final void m19678b(Context context, long j) {
        C8594l.m46771e(context, "<this>");
        try {
            Cursor query = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "album_id"}, "_id IN (" + j + ")", (String[]) null, (String) null);
            if (query != null) {
                query.moveToFirst();
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("audio/*");
                intent.addFlags(276824064);
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(query.getString(1))));
                context.startActivity(Intent.createChooser(intent, "Share"));
                query.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static final void m19679c(Context context, long j) {
        C8594l.m46771e(context, "<this>");
        Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j);
        C8594l.m46770d(withAppendedId, "withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, id)");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", withAppendedId);
        intent.setType("video/mp4");
        Intent createChooser = Intent.createChooser(intent, BuildConfig.FLAVOR);
        createChooser.setFlags(268435457);
        context.startActivity(createChooser);
    }
}
