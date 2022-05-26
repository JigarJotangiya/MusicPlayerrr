package p159f.p166c.p181e.p182a.p190b.p193j.p195c;

import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import p159f.p166c.p181e.p182a.p190b.C4450d;
import p159f.p166c.p181e.p182a.p190b.C4452f;

/* renamed from: f.c.e.a.b.j.c.b */
/* compiled from: FileTypeUtils */
public class C4469b {

    /* renamed from: a */
    private static final Map<String, C4470a> f13057a = new HashMap();

    /* renamed from: f.c.e.a.b.j.c.b$a */
    /* compiled from: FileTypeUtils */
    public enum C4470a {
        DIRECTORY(C4450d.eq_list_icon01, C4452f.type_directory, new String[0]),
        DOCUMENT(C4450d.ic_document_box, C4452f.type_document, new String[0]),
        CERTIFICATE(C4450d.ic_certificate_box, C4452f.type_certificate, "cer", "der", "pfx", "p12", "arm", "pem"),
        DRAWING(C4450d.ic_drawing_box, C4452f.type_drawing, "ai", "cdr", "dfx", "eps", "svg", "stl", "wmf", "emf", "art", "xar"),
        EXCEL(C4450d.ic_excel_box, C4452f.type_excel, "xls", "xlk", "xlsb", "xlsm", "xlsx", "xlr", "xltm", "xlw", "numbers", "ods", "ots"),
        IMAGE(C4450d.ic_image_box, C4452f.type_image, "bmp", "gif", "ico", "jpeg", "jpg", "pcx", "png", "psd", "tga", "tiff", "tif", "xcf"),
        MUSIC(C4450d.ic_music_box, C4452f.type_music, "aiff", "aif", "wav", "flac", "m4a", "wma", "amr", "mp2", "mp3", "wma", "aac", "mid", "m3u"),
        VIDEO(C4450d.ic_video_box, C4452f.type_video, "avi", "mov", "wmv", "mkv", "3gp", "f4v", "flv", "mp4", "mpeg", "webm"),
        PDF(C4450d.ic_pdf_box, C4452f.type_pdf, "pdf"),
        POWER_POINT(C4450d.ic_powerpoint_box, C4452f.type_power_point, "pptx", "keynote", "ppt", "pps", "pot", "odp", "otp"),
        WORD(C4450d.ic_word_box, C4452f.type_word, "doc", "docm", "docx", "dot", "mcw", "rtf", "pages", "odt", "ott"),
        ARCHIVE(C4450d.ic_zip_box, C4452f.type_archive, "cab", "7z", "alz", "arj", "bzip2", "bz2", "dmg", "gzip", "gz", "jar", "lz", "lzip", "lzma", "zip", "rar", "tar", "tgz"),
        APK(C4450d.ic_apk_box, C4452f.type_apk, "apk");
        
        private int description;
        private String[] extensions;
        private int icon;

        private C4470a(int i, int i2, String... strArr) {
            this.icon = i;
            this.description = i2;
            this.extensions = strArr;
        }

        public int getDescription() {
            return this.description;
        }

        public String[] getExtensions() {
            return this.extensions;
        }

        public int getIcon() {
            return this.icon;
        }
    }

    static {
        for (C4470a aVar : C4470a.values()) {
            for (String put : aVar.getExtensions()) {
                f13057a.put(put, aVar);
            }
        }
    }

    /* renamed from: a */
    public static String m19550a(String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
        }
        return MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase();
    }

    /* renamed from: b */
    public static C4470a m19551b(File file) {
        if (file.isDirectory()) {
            return C4470a.DIRECTORY;
        }
        C4470a aVar = f13057a.get(m19550a(file.getName()));
        if (aVar != null) {
            return aVar;
        }
        return C4470a.DOCUMENT;
    }
}
