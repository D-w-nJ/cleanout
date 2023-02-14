package com.backend.waste.controller;

import com.backend.member.domain.Member;
import com.backend.util.ControllerTest;
import com.backend.waste.domain.Waste;
import com.backend.waste.dto.request.PatchWaste;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.multipart;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.*;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.patch;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Transactional
public class WasteControllerTest extends ControllerTest {

//    @Test
//    @DisplayName("이미지를 업로드하면 폐기물 등록에 성공합니다")
//    void createWaste() throws Exception {
//        //given
//        MultipartFile imageFile = new MockMultipartFile("image", "waste1.PNG", MediaType.IMAGE_PNG_VALUE, "<<wasteImage>>".getBytes());
//        Member member = saveMemberInRepository();
//        MockHttpSession session = loginMemberSession(member);
//
//        //
//        mockMvc.perform(
//                        multipart("/waste-management/image")
//                                .file("image", imageFile.getBytes())
//                                .session(session)
//                                .contentType(MediaType.MULTIPART_FORM_DATA))
//                .andExpect(status().isOk())
//                .andDo(document("waste/create/200"));
//    }
//
//    @Test
//    @DisplayName("등록된 폐기물일 경우 가격이 책정됩니다.")
//    void updateWaste() throws Exception {
//        //given
//        Member member = saveMemberInRepository();
//        MockHttpSession session = loginMemberSession(member);
//        Waste waste = saveWaste(member);
//        String imageName = waste.getImageName();
//
//        PatchWaste patchWaste = PatchWaste.builder()
//                .wasteName("냉장고-300L이상")
//                .price(6000)
//                .imageName(imageName)
//                .build();
//
//        String patchWasteJson = objectMapper.writeValueAsString(patchWaste);
//
//        //
//        mockMvc.perform(
//                patch("/waste-management/waste")
//                        .session(session)
//                        .contentType(APPLICATION_JSON)
//                        .content(patchWasteJson))
//                .andExpect(status().isOk())
//                .andDo(document("waste/update/200",
//                        requestFields(
//                                fieldWithPath("wasteName").description("제품명"),
//                                fieldWithPath("price").description("가격"),
//                                fieldWithPath("imageName").description("해당 이미지 이름"))
//                        ));
//    }
}
