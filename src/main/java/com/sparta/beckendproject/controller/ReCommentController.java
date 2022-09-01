package com.sparta.beckendproject.controller;

import com.sparta.beckendproject.controller.request.ReCommentRequestDto;
import com.sparta.beckendproject.controller.response.ResponseDto;
import com.sparta.beckendproject.service.ReCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Validated
@RequiredArgsConstructor
@RestController
public class ReCommentController {

    private final ReCommentService reCommentService;

    @RequestMapping(value = "/api/auth/reComment", method = RequestMethod.POST)
    public ResponseDto<?> createReComment(@RequestBody ReCommentRequestDto reCommentRequestDto,
                                           HttpServletRequest request) {
        return reCommentService.createReComment(reCommentRequestDto, request);
    }

    @RequestMapping(value = "/api/reComment/{id}", method = RequestMethod.GET)
    public ResponseDto<?> getAllReComments(@PathVariable Long id) {
        return reCommentService.getAllReCommentsByComment(id);
    }

    @RequestMapping(value = "/api/auth/reComment/{id}", method = RequestMethod.PUT)
    public ResponseDto<?> updateReComment(@PathVariable Long id, @RequestBody ReCommentRequestDto reCommentRequestDto,
                                          HttpServletRequest request) {
        return reCommentService.updateReComment(id, reCommentRequestDto, request);
    }

    @RequestMapping(value = "/api/auth/reComment/{id}", method = RequestMethod.DELETE)
    public ResponseDto<?> deleteReComment(@PathVariable Long id, HttpServletRequest request) {
        return reCommentService.deleteReComment(id, request);
    }
}