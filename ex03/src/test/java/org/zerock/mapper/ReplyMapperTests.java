package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyMapperTests {
	
	private  int[] bnoarr = {1, 2, 47, 4, 46, 48};
	
	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;
	
	
	
	@Test
	public void testList2() {
		
		Criteria cri = new Criteria(2, 10);
		
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 188);
		
		replies.forEach(reply -> log.info(reply));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test
	
	public void testList() {
		
		Criteria cri = new Criteria();
		
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoarr[0]);
		
		replies.forEach(reply -> log.info(reply));
		
	}
	*/
	
	
	
	
	
	/*@Test
	public void testupdate() {
		
		int rno = 2;
		
		ReplyVO vo =mapper.read(rno);
		
		vo.setReply("UPDAT REPLY");
		
		int count = mapper.update(vo);
		
		log.info("UPDAE COUNT : "+ count);
		
		
	}*/
	
	
	
	
	
	
	
	
/*	@Test
	public void testdelete() {
		int bno  = 1;
		
		mapper.delete(bno);
		
		
	}
	*/
	
	
	/*@Test
	public void testRead() {
		int rno = 6;
		
		ReplyVO vo = mapper.read(rno);
		
		log.info(vo);
		
	}
	*/
	
	
	
	
	
	/*@Test
	public void  testCreate() {
		
		IntStream.range(1, 10).forEach(i -> {
			ReplyVO vo = new ReplyVO();
			
			vo.setBno(bnoarr[i % 5]);
			vo.setReply("ReplyTest"+ i);
			vo.setReplyer("Replyer" + i);
			
			mapper.insert(vo);
		});
		
	}
	*/
	

	
	
	
	/*@Test
	public void testMapper() {

		log.info(mapper);
	}
	*/
}
