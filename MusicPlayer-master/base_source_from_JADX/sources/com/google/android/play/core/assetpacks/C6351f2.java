package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.google.android.play.core.assetpacks.f2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final /* synthetic */ class C6351f2 implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f29448a;

    public /* synthetic */ C6351f2(String str) {
        this.f29448a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f29448a).concat("-")) && str.endsWith(".apk");
    }
}
