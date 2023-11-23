package org.roopsai.jobapptracker;

import org.roopsai.jobapptracker.model.Job;
import org.roopsai.jobapptracker.model.JobRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobapptrackerApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(JobapptrackerApplication.class);

	private final JobRepository jobRepository;

	public JobapptrackerApplication(JobRepository jobRepository) {
		this.jobRepository = jobRepository;
		logger.info("Starting JobapptrackerApplication");
    }
	public static void main(String[] args) {
		SpringApplication.run(JobapptrackerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		jobRepository.save(new Job(
				"Software Developer", "Google", "Hyderabad"
		));
		for(Job job : jobRepository.findAll()) {
			logger.info(job.toString());
		}
	}
}
