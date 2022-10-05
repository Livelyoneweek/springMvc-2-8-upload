package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    //고객 업로드파일명
    private String uploadFileName;

    //실제 저장 파일명,uuid
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
