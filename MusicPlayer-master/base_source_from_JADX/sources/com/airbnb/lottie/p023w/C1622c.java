package com.airbnb.lottie.p023w;

import com.airbnb.lottie.p026y.C1679d;

/* renamed from: com.airbnb.lottie.w.c */
/* compiled from: FileExtension */
public enum C1622c {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    private C1622c(String str) {
        this.extension = str;
    }

    public static C1622c forFile(String str) {
        for (C1622c cVar : values()) {
            if (str.endsWith(cVar.extension)) {
                return cVar;
            }
        }
        C1679d.m8416c("Unable to find correct extension for " + str);
        return JSON;
    }

    public String tempExtension() {
        return ".temp" + this.extension;
    }

    public String toString() {
        return this.extension;
    }
}
