import schedule
import time

def job():
    print('Reminder: drink water')

schedule.every(5).seconds.do(job)

while True:
    schedule.run_pending()
    time.sleep(1)
