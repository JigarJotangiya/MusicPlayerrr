package coocent.musiclibrary.music.p285f.p287c;

import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import p342g.p359b.C8349c;
import p342g.p359b.C8353g;

/* renamed from: coocent.musiclibrary.music.f.c.b */
/* compiled from: FileTypeUtils */
public class C7351b {

    /* renamed from: a */
    private static Map<String, C7352a> f32395a = new HashMap();

    /* renamed from: coocent.musiclibrary.music.f.c.b$a */
    /* compiled from: FileTypeUtils */
    public enum C7352a {
        DIRECTORY(C8349c.eq_list_icon01, C8353g.type_directory, new String[0]),
        DOCUMENT(C8349c.ic_document_box, C8353g.type_document, new String[0]),
        CERTIFICATE(C8349c.ic_certificate_box, C8353g.type_certificate, "cer", "der", "pfx", "p12", "arm", "pem"),
        DRAWING(C8349c.ic_drawing_box, C8353g.type_drawing, "ai", "cdr", "dfx", "eps", "svg", "stl", "wmf", "emf", "art", "xar"),
        EXCEL(C8349c.ic_excel_box, C8353g.type_excel, "xls", "xlk", "xlsb", "xlsm", "xlsx", "xlr", "xltm", "xlw", "numbers", "ods", "ots"),
        IMAGE(C8349c.ic_image_box, C8353g.type_image, "bmp", "gif", "ico", "jpeg", "jpg", "pcx", "png", "psd", "tga", "tiff", "tif", "xcf"),
        MUSIC(C8349c.ic_music_box, C8353g.type_music, "aiff", "aif", "wav", "flac", "m4a", "wma", "amr", "mp2", "mp3", "wma", "aac", "mid", "m3u"),
        VIDEO(C8349c.ic_video_box, C8353g.type_video, "avi", "mov", "wmv", "mkv", "3gp", "f4v", "flv", "mp4", "mpeg", "webm"),
        PDF(C8349c.ic_pdf_box, C8353g.type_pdf, "pdf"),
        POWER_POINT(C8349c.ic_powerpoint_box, C8353g.type_power_point, "pptx", "keynote", "ppt", "pps", "pot", "odp", "otp"),
        WORD(C8349c.ic_word_box, C8353g.type_word, "doc", "docm", "docx", "dot", "mcw", "rtf", "pages", "odt", "ott"),
        ARCHIVE(C8349c.ic_zip_box, C8353g.type_archive, "cab", "7z", "alz", "arj", "bzip2", "bz2", "dmg", "gzip", "gz", "jar", "lz", "lzip", "lzma", "zip", "rar", "tar", "tgz"),
        APK(C8349c.ic_apk_box, C8353g.type_apk, "apk");
        
        private int description;
        private String[] extensions;
        private int icon;

        private C7352a(int i, int i2, String... strArr) {
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
        for (C7352a aVar : C7352a.values()) {
            for (String put : aVar.getExtensions()) {
                f32395a.put(put, aVar);
            }
        }
    }

    /* renamed from: a */
    public static String m41547a(String str) {
        try {
            str = URLEncoder.encode(str, "UTF-8").replace("+", "%20");
        } catch (UnsupportedEncodingException unused) {
        }
        return MimeTypeMap.getFileExtensionFromUrl(str).toLowerCase();
    }

    /* renamed from: b */
    public static C7352a m41548b(File file) {
        if (file.isDirectory()) {
            return C7352a.DIRECTORY;
        }
        C7352a aVar = f32395a.get(m41547a(file.getName()));
        if (aVar != null) {
            return aVar;
        }
        return C7352a.DOCUMENT;
    }
}
