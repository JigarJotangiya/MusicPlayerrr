package p342g.p343a.p344a.p358i;

import android.content.Context;
import android.content.Intent;
import coocent.music.player.activity.CustomEqActivity;
import coocent.music.player.activity.SkinDownLoadActivity;
import coocent.music.player.activity.SoundEffectListActivity;
import coocent.music.player.skin.net.MySkinEntity;

/* renamed from: g.a.a.i.k */
/* compiled from: IntentUtils */
public class C8333k {
    /* renamed from: a */
    public static Intent m46050a(Context context, int i, int i2, boolean z) {
        Intent intent = new Intent(context, CustomEqActivity.class);
        intent.putExtra("pageType", i);
        intent.putExtra("editSoundEffectId", i2);
        intent.putExtra("isSystem", z);
        return intent;
    }

    /* renamed from: b */
    public static Intent m46051b(Context context, int i, int i2, boolean z) {
        Intent intent = new Intent(context, CustomEqActivity.class);
        intent.putExtra("pageType", i);
        intent.putExtra("editSoundEffectId", i2);
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
            intent.putExtra("isSystem", true);
        }
        intent.putExtra("sideBar", z);
        return intent;
    }

    /* renamed from: c */
    public static Intent m46052c(Context context, MySkinEntity mySkinEntity) {
        Intent intent = new Intent(context, SkinDownLoadActivity.class);
        intent.putExtra("skinEntity", mySkinEntity);
        return intent;
    }

    /* renamed from: d */
    public static Intent m46053d(Context context) {
        return new Intent(context, SoundEffectListActivity.class);
    }
}
