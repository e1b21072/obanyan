package oit.is.obanyan.obanyan.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sample26")
public class Sample26Controller {
  @GetMapping
  public String sample26() {
    return "sample26.html";
  }

  @PostMapping
  public String sample27(@RequestParam Integer min, @RequestParam Integer max, ModelMap model) {
    int sum = 0;
    ArrayList<Integer> sumRange = new ArrayList<>();
    // minからmaxまでの数値を加算し，sumに代入する
    // 同時にminからmaxまでの数値を順にArrayListに格納する
    for (int i = min; i <= max; i++) {
      sum = sum + i;
      sumRange.add(i);
    }
    model.addAttribute("sumRange", sumRange);
    model.addAttribute("sum", sum);
    return "sample26.html";
  }
}
