package com.sparta.beckendproject.controller;

import com.sparta.beckendproject.controller.response.ResponseDto;
import com.sparta.beckendproject.service.HeartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequiredArgsConstructor
public class HeartController {

    private final HeartService heartService;

    @PostMapping("/api/heart/post/{postId}")
    public ResponseDto<?> postHeart(@PathVariable Long postId, HttpServletRequest request) {
        return heartService.postHeart(postId, request);
    }

    @DeleteMapping("/api/heart/post/{postId}")
    public ResponseDto<?> deletePostHeart(@PathVariable Long postId, HttpServletRequest request) {
        return heartService.deletePostHeart(postId, request);
    }

    @PostMapping("/api/heart/comment/{commentId}")
    public ResponseDto<?> commentHeart(@PathVariable Long commentId, HttpServletRequest request) {
        return heartService.commentHeart(commentId, request);
    }

    @DeleteMapping("/api/heart/comment/{commentId}")
    public ResponseDto<?> deleteCommentHeart(@PathVariable Long commentId, HttpServletRequest request) {
        return heartService.deleteCommentHeart(commentId, request);
    }

    @PostMapping("/api/heart/reComment/{reCommentId}")
    public ResponseDto<?> reCommentHeart(@PathVariable Long reCommentId, HttpServletRequest request) {
        return heartService.reCommentHeart(reCommentId, request);
    }

    @DeleteMapping("/api/heart/reComment/{reCommentId}")
    public ResponseDto<?> deleteReCommentHeart (@PathVariable Long reCommentId, HttpServletRequest request) {
        return heartService.deleteReCommentHeart(reCommentId, request);
    }

}