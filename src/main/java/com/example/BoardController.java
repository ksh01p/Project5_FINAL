package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class BoardController {
    @Autowired
    BoardDAO boardDAO;

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public String boardlist(Model model){
        model.addAttribute("list", boardDAO.getBoardList());
        return "posts";
    }

    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String addPost(){
        return "addpostform";
    }

    @RequestMapping(value="/addok", method = RequestMethod.POST)
    public String addPostOK(BoardVO vo){
        int i = boardDAO.insertBoard(vo);
        if(i == 0)
            System.out.println("데이터 추가 실패");
        else
            System.out.println("데이터 추가 성공");
        return "redirect:list"; // "/board/list"로 리다이렉트
    }

    @RequestMapping(value="/editform/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model){
        System.out.println("editPost method start");
        BoardVO boardVO = boardDAO.getBoard(id);
        model.addAttribute("u", boardVO);
        return "editform";
    }

    @RequestMapping(value="/editok", method = RequestMethod.POST)
    public String editPostOK(BoardVO vo){
        System.out.println("editPostOK method start");
        int i = boardDAO.updateBoard(vo);
        if(i == 0)
            System.out.println("데이터 수정 실패");
        else
            System.out.println("데이터 수정 성공");
        return "redirect:/board/list"; // "/board/list"로 리다이렉트
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public String deletePost(@PathVariable("id") int id){
        int i = boardDAO.deleteBoard(id);
        if(i == 0)
            System.out.println("데이터 삭제 실패");
        else
            System.out.println("데이터 삭제 성공");
        return "redirect:../list"; // "/board/list"로 리다이렉트
    }
    @RequestMapping(value="/views/{id}", method = RequestMethod.GET)
    public String viewPost(@PathVariable("id") int id, Model model) {
        System.out.println("viewPost method start");
        BoardVO boardVO = boardDAO.getBoard(id);

        if (boardVO == null) {
            System.out.println("해당 데이터를 찾을 수 없습니다.");
            return "redirect:/board/list";
        }

        model.addAttribute("u", boardVO);
        return "views";
    }
    }


