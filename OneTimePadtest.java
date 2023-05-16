/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DES;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Random;
import javax.xml.bind.DatatypeConverter;

public class OneTimePadtest {

    public static void main(String[] args) throws UnsupportedEncodingException {
//        String plaintext = "HELLOWORLD";
//        String key = generateKey(plaintext.length());
//        String ciphertext = encrypt(plaintext, key);
//        System.out.println("Plaintext: " + plaintext);
//        System.out.println("Key: " + key);
//        System.out.println("Ciphertext: " + ciphertext);
//        String cipher = "32510ba9babebbbefd001547a810e67149caee11d945cd7fc81a05e9f85aac650e9052ba6a8cd8257bf14d";                 
//        byte [] cipherBytes = DatatypeConverter.parseHexBinary(cipher);
//        for (int i = 0; i < cipherBytes.length; i++) {
//            System.out.print(", " + cipherBytes[i]);
//        }
//        System.out.println("");
//        System.out.println("here " + cipherBytes.length);
//        String str = new String(cipherBytes,StandardCharsets.UTF_8);

        String[] MSGS = new String[11];
        MSGS[0] = "F6312B54DE9983AA37C8B7998BE1A07614894AF8BDB05D0CE5AD29D6E50DCAFA374CC9A43DC4528928EA5A4D65D1E2FB18DA2335C9331751B1098736A5C2AABCFFAD6C849D660BBFF31A307EBA916EF1502FAC941731F239C67F61D42517260CE57791DD07914EC597F853A6C98654ADB237754707B0A442B2C2DAC3C45FF5422D4CC7659794456900237E3E3A6963786C1282910CA97FFE423BC2B6FD16E95CA9B634DBAA21D72838";
        MSGS[1] = "FF2D7C48C789D1E92FC9E2DC89F3A73A0CC557F8E9AC4D0CE5AD29DAB65EDBFC20568DF337CD53CA3AA5400B2BC0E2E74C972A3BC8310A16B0038620A5C4AAA5E7E4769ED471438EBB11223DA69765BE5229ADDA582EBD2DC6686CC83B50290CE77D909401DF1EDE8BAC57F48A9E10BBB42A274A48AAF601A4C49BDFC05FF5106C09D97381C15072557766332B286278";
        MSGS[2] = "FB2D7948DCCCCAB925D3FADC83E1E96E05CC04FAA6AA4A49A6B62CDEAA108FFF3750C0A430CE1DC804B8504E2ECCE9E44ED46F12C92F0107B914D53EEAC2AAFDF2AA7BD0996A598EBB032631BD9C72F14635ACDA4421FE27C66D67DF72432E5EE476C2DB06DF1BC291B655A6DE8258E8AF22385B48B6E54CA3C09F8BD14CE8166C03C36596C14873447779292B3B317C7816869D";
        MSGS[3] = "9736634CC5CCC4AC22D5B7908FF4BD3A19C604E0A1B05D01A0AF24C1E517C1ED3D50C3A428C94ECA36A4534437D1F2ED0D8E2A7AC3360B04BB0ED527EA90B8BCFFAF3F969D77589FBB1A2D2AA2D063B94267A69C5121FE29C67861DA2617234DF83CC2FD0E8C1ED88ABD56A6C8931DBCB42A261E1BACF054B2D893C4CB";
        MSGS[4] = "9703674191ADC1A623D2B7BF83E0AA6F04DD57B7A0AA1E19B0BB2DDAB616C6F73F02CCA42CCD4F8326B915442385E6F118932C36C32B441EB246903EE7D5ABB9F6A03F8391665E99F2073A7EBA9963B90726E989433AF222812C6FD43142340CEE7CC2DA058B19DE8AB312F5CF8948BAB5372C";
        MSGS[5] = "F32B6F0DC883D6E922D4EEDC9EFDE96F1ECC04EEA6AC4C49A7AB20DAAB5EDBF63C43D4BB7FE11D882ABE15522AD0A7EB0D8C2A34812C4408B912D473D6C4AEAFE7E4719F83";
        MSGS[6] = "E330720DD98DD1AD33D4B79185E1BD3A02CF04E3A1B04D49B1BC39C7E517DCB93547CCEA36C65A8626B9460A65D0E9EF09893C7ADF371151BA099626F690A0B3B3B07795D4684A82F553373FBF9772A50730A1935420BD25952C7DD337172C49F83280CD149A1D9197B65EFF";
        MSGS[7] = "F6317858DC8983BD3EC7E3DC83B2A17B1BCC04F3ACBF5707A0BD61DDA0098FCB394CC9EB328009D86AEA5C4565C6EBE21F896F3BC83C4418B246943DEAC4A7B8E1E47C9C957658CBF2532239AC9979F14328E994523FBD1E87626DD43F1F6E0CEE7C8ECD409E00D5D8B112E1C59E1DACB525335B1AA0EA55F3DE9FD8D045E44C6242DC73C49541785232363E203031697A14879D09BD79BB1627CFF7EF5FEE1DA6F72A89B620D66B3E5F3DABD871161B8F4A49D5ABB18BC7A7F806B4D9FDE8D46E1DA59E5316654EC9DC8042EAB27716423902C36D651D2BC126D4C8AA17F9436523ECFB94BBE2D17C1DAA0989699A4E110513F6DB95B3E2BBC74F5F14DF81CCFF8CB7A977A59F60283D62AE5F54F78B2CF8B898F07BCBE4CAB5C735C48914B66EAD60CA33F4A186F94B8EEF9994F0B4CF3CBC78329B32758FDCA1B718BBE0F27009";
        MSGS[8] = "FE362B40D88BCBBD76D5F29987B2BC741FCC48F6BDBC5A49B6B02FD0A05EC6ED784FC8F63AC444CA30AF50463685F3EC4C982A7AC7781614BA079627EAC2EFBFE6B03F9980254298BB172638A49E7EA5422BB0DA452DF12D92696D957278170CF6739194129A43D896AB46E7C49E54A9A82A3B5948B1EC44F3FE9BC5C146FD422B09DB6596805D72527773292B3B683D6B1E829640B864BB163EC2E2F310E31DB2F73789A624CE27295A";
        MSGS[9] = "E730644FDD89CEE93FD5B78882F3BD3A14C651B7BABC5B0DE5AD29D6E50CCEF73C4DC0A438CD538F31AB41443785E6E40D932174861D1214AE1FD527ECDDAAFDEAAB6AD087604E8FBB1A377EB99872F14E29A08E5E29F1";
        MSGS[10] = "E32A6E0DC289C0BB33D2B7918FE1BA7B0ACC04FEBAE31E3EADBC2F93B00DC6F73F02CCA42CDC4F8F22A715482CD5EFE61EDA213FD03D1651A9159073F1D8AAFDF8A166D0996A598EBB072B3FA3D078BF4422E9D20671AF7BD63E3E92";
        int templength = 1000;
        for (int i = 0; i < MSGS.length; i++) {
            templength = Math.min(templength, MSGS[i].length());
        }

        for (int i = 0; i < MSGS.length; i++) {
            MSGS[i] = MSGS[i].substring(0, templength);
        }

        byte[] cipherBytes1 = DatatypeConverter.parseHexBinary(MSGS[0]);
        byte[] cipherBytes2 = DatatypeConverter.parseHexBinary(MSGS[1]);
        byte[] cipherBytes3 = DatatypeConverter.parseHexBinary(MSGS[2]);
        byte[] cipherBytes4 = DatatypeConverter.parseHexBinary(MSGS[3]);
        byte[] cipherBytes5 = DatatypeConverter.parseHexBinary(MSGS[4]);
        byte[] cipherBytes6 = DatatypeConverter.parseHexBinary(MSGS[5]);
        byte[] cipherBytes7 = DatatypeConverter.parseHexBinary(MSGS[6]);
        byte[] cipherBytes8 = DatatypeConverter.parseHexBinary(MSGS[7]);
        byte[] cipherBytes9 = DatatypeConverter.parseHexBinary(MSGS[8]);
        byte[] cipherBytes10 = DatatypeConverter.parseHexBinary(MSGS[9]);
        byte[] cipherBytes11 = DatatypeConverter.parseHexBinary(MSGS[10]);
        char arr[] = new char[templength];
        for (int i = 0; i < MSGS.length - 1; i++) {
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                cipherBytes1[j] ^= cipherBytes11[j];
                cipherBytes2[j] ^= cipherBytes11[j];
                cipherBytes3[j] ^= cipherBytes11[j];
                cipherBytes4[j] ^= cipherBytes11[j];
                cipherBytes5[j] ^= cipherBytes11[j];
                cipherBytes6[j] ^= cipherBytes11[j];
                cipherBytes7[j] ^= cipherBytes11[j];
                cipherBytes8[j] ^= cipherBytes11[j];
                cipherBytes9[j] ^= cipherBytes11[j];
                cipherBytes10[j] ^= cipherBytes11[j];
            }
        }
        
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                char asciiChar = (char) cipherBytes1[j];
                System.out.print(asciiChar);
            }
            System.out.println("");
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                char asciiChar = (char) cipherBytes2[j];
                System.out.print(asciiChar);
            }
            System.out.println("");
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                char asciiChar = (char) cipherBytes3[j];
                System.out.print(asciiChar);
            }
            System.out.println("");
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                char asciiChar = (char) cipherBytes4[j];
                System.out.print(asciiChar);
            }
            System.out.println("");
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                char asciiChar = (char) cipherBytes5[j];
                System.out.print(asciiChar);
            }
            System.out.println("");
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                char asciiChar = (char) cipherBytes6[j];
                System.out.print(asciiChar);
            }
            System.out.println("");
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                char asciiChar = (char) cipherBytes7[j];
                System.out.print(asciiChar);
            }
            System.out.println("");
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                char asciiChar = (char) cipherBytes8[j];
                System.out.print(asciiChar);
            }
            System.out.println("");
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                char asciiChar = (char) cipherBytes9[j];
                System.out.print(asciiChar);
            }
            System.out.println("");
            for (int j = 0; j < Math.max(cipherBytes1.length, cipherBytes11.length); j++) {
                char asciiChar = (char) cipherBytes10[j];
                System.out.print(asciiChar);
            }
            System.out.println("");
           
        

    }

    public static String hexToAscii(String hexStr) {
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < hexStr.length(); i += 2) {
            String str = hexStr.substring(i, i + 2);
            output.append((char) Integer.parseInt(str, 16));
        }
        return output.toString();
    }

    public static String generateKey(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append((char) (random.nextInt(26) + 'A'));
        }
        return sb.toString();
    }

    public static String encrypt(String plaintext, String key) {
        byte[] plaintextBytes = plaintext.getBytes();
        byte[] keyBytes = key.getBytes();
        byte[] ciphertextBytes = new byte[plaintextBytes.length];
        for (int i = 0; i < plaintextBytes.length; i++) {
            ciphertextBytes[i] = (byte) (plaintextBytes[i] ^ keyBytes[i]);
        }
        return new String(ciphertextBytes.toString());
    }

    public static String decrypt(String ciphertext, String key) {
        char[] plain = new char[ciphertext.length()];
        for (int i = 0; i < ciphertext.length(); i++) {
            int c = (ciphertext.charAt(i) - key.charAt(i) + 26) % 26 + 'A';
            plain[i] = (char) c;
        }
        return new String(plain);
    }
}
