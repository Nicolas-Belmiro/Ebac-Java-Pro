package meme.service;



import meme.repository.MemeRepository;

@Component
public class MemeService {

    @Autowired
    private final MemeRepository memeRepository;

    public MemeService(MemeRepository memeRepository) {
        this.memeRepository = memeRepository;
    }

    public Meme criarMeme(Meme meme) {
        return memeRepository.save(meme);
    }

    public Iterable<Meme> findAllMemes() {
        return memeRepository.findAll();
    }
}